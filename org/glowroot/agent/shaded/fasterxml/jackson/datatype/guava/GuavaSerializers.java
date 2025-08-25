package org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava;

import java.util.HashSet;

import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.TypeFactory;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.util.ArrayBuilders;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.util.StdConverter;
import org.glowroot.agent.shaded.google.common.base.Optional;
import org.glowroot.agent.shaded.google.common.cache.CacheBuilder;
import org.glowroot.agent.shaded.google.common.cache.CacheBuilderSpec;
import org.glowroot.agent.shaded.google.common.collect.FluentIterable;
import org.glowroot.agent.shaded.google.common.collect.Multimap;
import org.glowroot.agent.shaded.google.common.collect.Range;
import org.glowroot.agent.shaded.google.common.hash.HashCode;
import org.glowroot.agent.shaded.google.common.net.HostAndPort;
import org.glowroot.agent.shaded.google.common.net.InternetDomainName;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.*;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.introspect.Annotated;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.jsontype.TypeSerializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.Serializers;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.glowroot.agent.shaded.fasterxml.jackson.databind.type.MapLikeType;
import org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;
import org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import org.glowroot.agent.shaded.fasterxml.jackson.datatype.guava.ser.RangeSerializer;

public class GuavaSerializers extends Serializers.Base
{
    static class FluentConverter extends StdConverter<Object,Iterable<?>> {
        static final FluentConverter instance = new FluentConverter();

        @Override
        public Iterable<?> convert(Object value) {
            return (Iterable<?>) value;
        }
    }

    @Override
    public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc)
    {
        Class<?> raw = type.getRawClass();
        if (Optional.class.isAssignableFrom(raw)){
            return new GuavaOptionalSerializer(type);
        }
        if (Range.class.isAssignableFrom(raw)) {
            return new RangeSerializer(type);
        }
        // since 2.4
        if (HostAndPort.class.isAssignableFrom(raw)) {
            return ToStringSerializer.instance;
        }
        // since 2.4.3
        if (InternetDomainName.class.isAssignableFrom(raw)) {
            return ToStringSerializer.instance;
        }
        // not sure how useful, but why not?
        if (CacheBuilderSpec.class.isAssignableFrom(raw) || CacheBuilder.class.isAssignableFrom(raw)) {
            return ToStringSerializer.instance;
        }
        if (HashCode.class.isAssignableFrom(raw)) {
            return ToStringSerializer.instance;
	}
        // since 2.4.5
        if (FluentIterable.class.isAssignableFrom(raw)) {
            // We can use parameter type that GuavaTypeModifier has kindly resolved for us
            JavaType vt = type.containedType(0);
            if (vt == null) { // should never happen but
                vt = TypeFactory.unknownType();
            }
            // 04-Dec-2014, tatu: Not 100% sure why latter would fail... need to investigate when I have time
            JavaType delegate = config.getTypeFactory().constructParametrizedType(Iterable.class, Iterable.class, vt);
//            JavaType delegate = config.getTypeFactory().constructParametrizedType(FluentIterable.class, Iterable.class, vt);
            return new StdDelegatingSerializer(FluentConverter.instance, delegate, null);
        }
        return super.findSerializer(config, type, beanDesc);
    }

    @Override
    public JsonSerializer<?> findMapLikeSerializer(SerializationConfig config,
            MapLikeType type, BeanDescription beanDesc, JsonSerializer<Object> keySerializer,
            TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer)
    {
        if (Multimap.class.isAssignableFrom(type.getRawClass())) {
            final AnnotationIntrospector intr = config.getAnnotationIntrospector();
            Object filterId = intr.findFilterId((Annotated)beanDesc.getClassInfo());
            String[] ignored = intr.findPropertiesToIgnore(beanDesc.getClassInfo(), true);
            HashSet<String> ignoredEntries = (ignored == null || ignored.length == 0)
                    ? null : ArrayBuilders.arrayToSet(ignored);

            return new MultimapSerializer(type, beanDesc,
                    keySerializer, elementTypeSerializer, elementValueSerializer, ignoredEntries, filterId);
        }
        return null;
    }
}
