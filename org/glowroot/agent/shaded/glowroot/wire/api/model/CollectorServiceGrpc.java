package org.glowroot.agent.shaded.glowroot.wire.api.model;

import static org.glowroot.agent.shaded.grpc.stub.ClientCalls.asyncUnaryCall;
import static org.glowroot.agent.shaded.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static org.glowroot.agent.shaded.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static org.glowroot.agent.shaded.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static org.glowroot.agent.shaded.grpc.stub.ClientCalls.blockingUnaryCall;
import static org.glowroot.agent.shaded.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static org.glowroot.agent.shaded.grpc.stub.ClientCalls.futureUnaryCall;
import static org.glowroot.agent.shaded.grpc.MethodDescriptor.generateFullMethodName;
import static org.glowroot.agent.shaded.grpc.stub.ServerCalls.asyncUnaryCall;
import static org.glowroot.agent.shaded.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static org.glowroot.agent.shaded.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static org.glowroot.agent.shaded.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static org.glowroot.agent.shaded.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static org.glowroot.agent.shaded.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: CollectorService.proto")
public final class CollectorServiceGrpc {

  private CollectorServiceGrpc() {}

  public static final String SERVICE_NAME = "org.glowroot.agent.shaded.glowroot.wire.api_model.CollectorService";

  // Static method descriptors that strictly reflect the proto.
  @org.glowroot.agent.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.shaded.grpc.MethodDescriptor<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage,
      org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse> METHOD_COLLECT_INIT =
      org.glowroot.agent.shaded.grpc.MethodDescriptor.<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage, org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse>newBuilder()
          .setType(org.glowroot.agent.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.glowroot.agent.shaded.glowroot.wire.api_model.CollectorService", "collectInit"))
          .setRequestMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse.getDefaultInstance()))
          .build();
  @org.glowroot.agent.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.shaded.grpc.MethodDescriptor<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage,
      org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage> METHOD_COLLECT_AGGREGATES =
      org.glowroot.agent.shaded.grpc.MethodDescriptor.<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage, org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage>newBuilder()
          .setType(org.glowroot.agent.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.glowroot.agent.shaded.glowroot.wire.api_model.CollectorService", "collectAggregates"))
          .setRequestMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage.getDefaultInstance()))
          .build();
  @org.glowroot.agent.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.shaded.grpc.MethodDescriptor<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateStreamMessage,
      org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage> METHOD_COLLECT_AGGREGATE_STREAM =
      org.glowroot.agent.shaded.grpc.MethodDescriptor.<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateStreamMessage, org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage>newBuilder()
          .setType(org.glowroot.agent.shaded.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "org.glowroot.agent.shaded.glowroot.wire.api_model.CollectorService", "collectAggregateStream"))
          .setRequestMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateStreamMessage.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage.getDefaultInstance()))
          .build();
  @org.glowroot.agent.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.shaded.grpc.MethodDescriptor<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage,
      org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> METHOD_COLLECT_GAUGE_VALUES =
      org.glowroot.agent.shaded.grpc.MethodDescriptor.<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage, org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>newBuilder()
          .setType(org.glowroot.agent.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.glowroot.agent.shaded.glowroot.wire.api_model.CollectorService", "collectGaugeValues"))
          .setRequestMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage.getDefaultInstance()))
          .build();
  @org.glowroot.agent.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.shaded.grpc.MethodDescriptor<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage,
      org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> METHOD_COLLECT_TRACE =
      org.glowroot.agent.shaded.grpc.MethodDescriptor.<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage, org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>newBuilder()
          .setType(org.glowroot.agent.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.glowroot.agent.shaded.glowroot.wire.api_model.CollectorService", "collectTrace"))
          .setRequestMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage.getDefaultInstance()))
          .build();
  @org.glowroot.agent.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.shaded.grpc.MethodDescriptor<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.TraceStreamMessage,
      org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> METHOD_COLLECT_TRACE_STREAM =
      org.glowroot.agent.shaded.grpc.MethodDescriptor.<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.TraceStreamMessage, org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>newBuilder()
          .setType(org.glowroot.agent.shaded.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "org.glowroot.agent.shaded.glowroot.wire.api_model.CollectorService", "collectTraceStream"))
          .setRequestMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.TraceStreamMessage.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage.getDefaultInstance()))
          .build();
  @org.glowroot.agent.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.shaded.grpc.MethodDescriptor<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage,
      org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> METHOD_LOG =
      org.glowroot.agent.shaded.grpc.MethodDescriptor.<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage, org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>newBuilder()
          .setType(org.glowroot.agent.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.glowroot.agent.shaded.glowroot.wire.api_model.CollectorService", "log"))
          .setRequestMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CollectorServiceStub newStub(org.glowroot.agent.shaded.grpc.Channel channel) {
    return new CollectorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CollectorServiceBlockingStub newBlockingStub(
      org.glowroot.agent.shaded.grpc.Channel channel) {
    return new CollectorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CollectorServiceFutureStub newFutureStub(
      org.glowroot.agent.shaded.grpc.Channel channel) {
    return new CollectorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CollectorServiceImplBase implements org.glowroot.agent.shaded.grpc.BindableService {

    /**
     */
    public void collectInit(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COLLECT_INIT, responseObserver);
    }

    /**
     * <pre>
     * deprecated in 0.9.5, replaced by collectAggregateStream
     * </pre>
     */
    public void collectAggregates(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COLLECT_AGGREGATES, responseObserver);
    }

    /**
     */
    public org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateStreamMessage> collectAggregateStream(
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_COLLECT_AGGREGATE_STREAM, responseObserver);
    }

    /**
     */
    public void collectGaugeValues(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COLLECT_GAUGE_VALUES, responseObserver);
    }

    /**
     * <pre>
     * deprecated in 0.9.5, replaced by collectTraceStream
     * </pre>
     */
    public void collectTrace(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COLLECT_TRACE, responseObserver);
    }

    /**
     */
    public org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.TraceStreamMessage> collectTraceStream(
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_COLLECT_TRACE_STREAM, responseObserver);
    }

    /**
     */
    public void log(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOG, responseObserver);
    }

    @java.lang.Override public final org.glowroot.agent.shaded.grpc.ServerServiceDefinition bindService() {
      return org.glowroot.agent.shaded.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_COLLECT_INIT,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage,
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse>(
                  this, METHODID_COLLECT_INIT)))
          .addMethod(
            METHOD_COLLECT_AGGREGATES,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage,
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage>(
                  this, METHODID_COLLECT_AGGREGATES)))
          .addMethod(
            METHOD_COLLECT_AGGREGATE_STREAM,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateStreamMessage,
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage>(
                  this, METHODID_COLLECT_AGGREGATE_STREAM)))
          .addMethod(
            METHOD_COLLECT_GAUGE_VALUES,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage,
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>(
                  this, METHODID_COLLECT_GAUGE_VALUES)))
          .addMethod(
            METHOD_COLLECT_TRACE,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage,
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>(
                  this, METHODID_COLLECT_TRACE)))
          .addMethod(
            METHOD_COLLECT_TRACE_STREAM,
            asyncClientStreamingCall(
              new MethodHandlers<
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.TraceStreamMessage,
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>(
                  this, METHODID_COLLECT_TRACE_STREAM)))
          .addMethod(
            METHOD_LOG,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage,
                org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>(
                  this, METHODID_LOG)))
          .build();
    }
  }

  /**
   */
  public static final class CollectorServiceStub extends org.glowroot.agent.shaded.grpc.stub.AbstractStub<CollectorServiceStub> {
    private CollectorServiceStub(org.glowroot.agent.shaded.grpc.Channel channel) {
      super(channel);
    }

    private CollectorServiceStub(org.glowroot.agent.shaded.grpc.Channel channel,
        org.glowroot.agent.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectorServiceStub build(org.glowroot.agent.shaded.grpc.Channel channel,
        org.glowroot.agent.shaded.grpc.CallOptions callOptions) {
      return new CollectorServiceStub(channel, callOptions);
    }

    /**
     */
    public void collectInit(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COLLECT_INIT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * deprecated in 0.9.5, replaced by collectAggregateStream
     * </pre>
     */
    public void collectAggregates(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COLLECT_AGGREGATES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateStreamMessage> collectAggregateStream(
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_COLLECT_AGGREGATE_STREAM, getCallOptions()), responseObserver);
    }

    /**
     */
    public void collectGaugeValues(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COLLECT_GAUGE_VALUES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * deprecated in 0.9.5, replaced by collectTraceStream
     * </pre>
     */
    public void collectTrace(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COLLECT_TRACE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.TraceStreamMessage> collectTraceStream(
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_COLLECT_TRACE_STREAM, getCallOptions()), responseObserver);
    }

    /**
     */
    public void log(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage request,
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CollectorServiceBlockingStub extends org.glowroot.agent.shaded.grpc.stub.AbstractStub<CollectorServiceBlockingStub> {
    private CollectorServiceBlockingStub(org.glowroot.agent.shaded.grpc.Channel channel) {
      super(channel);
    }

    private CollectorServiceBlockingStub(org.glowroot.agent.shaded.grpc.Channel channel,
        org.glowroot.agent.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectorServiceBlockingStub build(org.glowroot.agent.shaded.grpc.Channel channel,
        org.glowroot.agent.shaded.grpc.CallOptions callOptions) {
      return new CollectorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse collectInit(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COLLECT_INIT, getCallOptions(), request);
    }

    /**
     * <pre>
     * deprecated in 0.9.5, replaced by collectAggregateStream
     * </pre>
     */
    public org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage collectAggregates(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COLLECT_AGGREGATES, getCallOptions(), request);
    }

    /**
     */
    public org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage collectGaugeValues(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COLLECT_GAUGE_VALUES, getCallOptions(), request);
    }

    /**
     * <pre>
     * deprecated in 0.9.5, replaced by collectTraceStream
     * </pre>
     */
    public org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage collectTrace(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COLLECT_TRACE, getCallOptions(), request);
    }

    /**
     */
    public org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage log(org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOG, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CollectorServiceFutureStub extends org.glowroot.agent.shaded.grpc.stub.AbstractStub<CollectorServiceFutureStub> {
    private CollectorServiceFutureStub(org.glowroot.agent.shaded.grpc.Channel channel) {
      super(channel);
    }

    private CollectorServiceFutureStub(org.glowroot.agent.shaded.grpc.Channel channel,
        org.glowroot.agent.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectorServiceFutureStub build(org.glowroot.agent.shaded.grpc.Channel channel,
        org.glowroot.agent.shaded.grpc.CallOptions callOptions) {
      return new CollectorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public org.glowroot.agent.shaded.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse> collectInit(
        org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COLLECT_INIT, getCallOptions()), request);
    }

    /**
     * <pre>
     * deprecated in 0.9.5, replaced by collectAggregateStream
     * </pre>
     */
    public org.glowroot.agent.shaded.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage> collectAggregates(
        org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COLLECT_AGGREGATES, getCallOptions()), request);
    }

    /**
     */
    public org.glowroot.agent.shaded.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> collectGaugeValues(
        org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COLLECT_GAUGE_VALUES, getCallOptions()), request);
    }

    /**
     * <pre>
     * deprecated in 0.9.5, replaced by collectTraceStream
     * </pre>
     */
    public org.glowroot.agent.shaded.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> collectTrace(
        org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COLLECT_TRACE, getCallOptions()), request);
    }

    /**
     */
    public org.glowroot.agent.shaded.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage> log(
        org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOG, getCallOptions()), request);
    }
  }

  private static final int METHODID_COLLECT_INIT = 0;
  private static final int METHODID_COLLECT_AGGREGATES = 1;
  private static final int METHODID_COLLECT_GAUGE_VALUES = 2;
  private static final int METHODID_COLLECT_TRACE = 3;
  private static final int METHODID_LOG = 4;
  private static final int METHODID_COLLECT_AGGREGATE_STREAM = 5;
  private static final int METHODID_COLLECT_TRACE_STREAM = 6;

  private static final class MethodHandlers<Req, Resp> implements
      org.glowroot.agent.shaded.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      org.glowroot.agent.shaded.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      org.glowroot.agent.shaded.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      org.glowroot.agent.shaded.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CollectorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CollectorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, org.glowroot.agent.shaded.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT_INIT:
          serviceImpl.collectInit((org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitMessage) request,
              (org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.InitResponse>) responseObserver);
          break;
        case METHODID_COLLECT_AGGREGATES:
          serviceImpl.collectAggregates((org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldAggregateMessage) request,
              (org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage>) responseObserver);
          break;
        case METHODID_COLLECT_GAUGE_VALUES:
          serviceImpl.collectGaugeValues((org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.GaugeValueMessage) request,
              (org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>) responseObserver);
          break;
        case METHODID_COLLECT_TRACE:
          serviceImpl.collectTrace((org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.OldTraceMessage) request,
              (org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>) responseObserver);
          break;
        case METHODID_LOG:
          serviceImpl.log((org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.LogMessage) request,
              (org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public org.glowroot.agent.shaded.grpc.stub.StreamObserver<Req> invoke(
        org.glowroot.agent.shaded.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT_AGGREGATE_STREAM:
          return (org.glowroot.agent.shaded.grpc.stub.StreamObserver<Req>) serviceImpl.collectAggregateStream(
              (org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.AggregateResponseMessage>) responseObserver);
        case METHODID_COLLECT_TRACE_STREAM:
          return (org.glowroot.agent.shaded.grpc.stub.StreamObserver<Req>) serviceImpl.collectTraceStream(
              (org.glowroot.agent.shaded.grpc.stub.StreamObserver<org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.EmptyMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class CollectorServiceDescriptorSupplier implements org.glowroot.agent.shaded.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public org.glowroot.agent.shaded.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.glowroot.agent.shaded.glowroot.wire.api.model.CollectorServiceOuterClass.getDescriptor();
    }
  }

  private static volatile org.glowroot.agent.shaded.grpc.ServiceDescriptor serviceDescriptor;

  public static org.glowroot.agent.shaded.grpc.ServiceDescriptor getServiceDescriptor() {
    org.glowroot.agent.shaded.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CollectorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = org.glowroot.agent.shaded.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CollectorServiceDescriptorSupplier())
              .addMethod(METHOD_COLLECT_INIT)
              .addMethod(METHOD_COLLECT_AGGREGATES)
              .addMethod(METHOD_COLLECT_AGGREGATE_STREAM)
              .addMethod(METHOD_COLLECT_GAUGE_VALUES)
              .addMethod(METHOD_COLLECT_TRACE)
              .addMethod(METHOD_COLLECT_TRACE_STREAM)
              .addMethod(METHOD_LOG)
              .build();
        }
      }
    }
    return result;
  }
}
