package org.glowroot.wire.api.model;

import static org.glowroot.agent.it.harness.shaded.grpc.stub.ClientCalls.asyncUnaryCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ClientCalls.blockingUnaryCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ClientCalls.futureUnaryCall;
import static org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.generateFullMethodName;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.asyncUnaryCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: DownstreamService.proto")
public final class DownstreamServiceGrpc {

  private DownstreamServiceGrpc() {}

  public static final String SERVICE_NAME = "org_glowroot_wire_api_model.DownstreamService";

  // Static method descriptors that strictly reflect the proto.
  @org.glowroot.agent.it.harness.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor<org.glowroot.wire.api.model.DownstreamServiceOuterClass.AgentResponse,
      org.glowroot.wire.api.model.DownstreamServiceOuterClass.CentralRequest> METHOD_CONNECT =
      org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.<org.glowroot.wire.api.model.DownstreamServiceOuterClass.AgentResponse, org.glowroot.wire.api.model.DownstreamServiceOuterClass.CentralRequest>newBuilder()
          .setType(org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "org_glowroot_wire_api_model.DownstreamService", "connect"))
          .setRequestMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.wire.api.model.DownstreamServiceOuterClass.AgentResponse.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.wire.api.model.DownstreamServiceOuterClass.CentralRequest.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DownstreamServiceStub newStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
    return new DownstreamServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DownstreamServiceBlockingStub newBlockingStub(
      org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
    return new DownstreamServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DownstreamServiceFutureStub newFutureStub(
      org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
    return new DownstreamServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DownstreamServiceImplBase implements org.glowroot.agent.it.harness.shaded.grpc.BindableService {

    /**
     */
    public org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.wire.api.model.DownstreamServiceOuterClass.AgentResponse> connect(
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.wire.api.model.DownstreamServiceOuterClass.CentralRequest> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_CONNECT, responseObserver);
    }

    @java.lang.Override public final org.glowroot.agent.it.harness.shaded.grpc.ServerServiceDefinition bindService() {
      return org.glowroot.agent.it.harness.shaded.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CONNECT,
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.glowroot.wire.api.model.DownstreamServiceOuterClass.AgentResponse,
                org.glowroot.wire.api.model.DownstreamServiceOuterClass.CentralRequest>(
                  this, METHODID_CONNECT)))
          .build();
    }
  }

  /**
   */
  public static final class DownstreamServiceStub extends org.glowroot.agent.it.harness.shaded.grpc.stub.AbstractStub<DownstreamServiceStub> {
    private DownstreamServiceStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
      super(channel);
    }

    private DownstreamServiceStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownstreamServiceStub build(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      return new DownstreamServiceStub(channel, callOptions);
    }

    /**
     */
    public org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.wire.api.model.DownstreamServiceOuterClass.AgentResponse> connect(
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.wire.api.model.DownstreamServiceOuterClass.CentralRequest> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_CONNECT, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class DownstreamServiceBlockingStub extends org.glowroot.agent.it.harness.shaded.grpc.stub.AbstractStub<DownstreamServiceBlockingStub> {
    private DownstreamServiceBlockingStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
      super(channel);
    }

    private DownstreamServiceBlockingStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownstreamServiceBlockingStub build(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      return new DownstreamServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class DownstreamServiceFutureStub extends org.glowroot.agent.it.harness.shaded.grpc.stub.AbstractStub<DownstreamServiceFutureStub> {
    private DownstreamServiceFutureStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
      super(channel);
    }

    private DownstreamServiceFutureStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownstreamServiceFutureStub build(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      return new DownstreamServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONNECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DownstreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DownstreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<Req> invoke(
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNECT:
          return (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<Req>) serviceImpl.connect(
              (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.wire.api.model.DownstreamServiceOuterClass.CentralRequest>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class DownstreamServiceDescriptorSupplier implements org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.glowroot.wire.api.model.DownstreamServiceOuterClass.getDescriptor();
    }
  }

  private static volatile org.glowroot.agent.it.harness.shaded.grpc.ServiceDescriptor serviceDescriptor;

  public static org.glowroot.agent.it.harness.shaded.grpc.ServiceDescriptor getServiceDescriptor() {
    org.glowroot.agent.it.harness.shaded.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DownstreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = org.glowroot.agent.it.harness.shaded.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DownstreamServiceDescriptorSupplier())
              .addMethod(METHOD_CONNECT)
              .build();
        }
      }
    }
    return result;
  }
}
