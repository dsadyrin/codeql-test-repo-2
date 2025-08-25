package org.glowroot.agent.it.harness.grpc;

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
    comments = "Source: JavaagentService.proto")
public final class JavaagentServiceGrpc {

  private JavaagentServiceGrpc() {}

  public static final String SERVICE_NAME = "org_glowroot_agent_it_harness.JavaagentService";

  // Static method descriptors that strictly reflect the proto.
  @org.glowroot.agent.it.harness.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
      org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> METHOD_PING =
      org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void, org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>newBuilder()
          .setType(org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org_glowroot_agent_it_harness.JavaagentService", "ping"))
          .setRequestMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .build();
  @org.glowroot.agent.it.harness.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName,
      org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> METHOD_EXECUTE_APP =
      org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName, org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>newBuilder()
          .setType(org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org_glowroot_agent_it_harness.JavaagentService", "executeApp"))
          .setRequestMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .build();
  @org.glowroot.agent.it.harness.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
      org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> METHOD_INTERRUPT_APP =
      org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void, org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>newBuilder()
          .setType(org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org_glowroot_agent_it_harness.JavaagentService", "interruptApp"))
          .setRequestMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .build();
  @org.glowroot.agent.it.harness.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
      org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> METHOD_SET_SLOW_THRESHOLD_TO_ZERO =
      org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void, org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>newBuilder()
          .setType(org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org_glowroot_agent_it_harness.JavaagentService", "setSlowThresholdToZero"))
          .setRequestMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .build();
  @org.glowroot.agent.it.harness.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
      org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> METHOD_RESET_CONFIG =
      org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void, org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>newBuilder()
          .setType(org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org_glowroot_agent_it_harness.JavaagentService", "resetConfig"))
          .setRequestMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .build();
  @org.glowroot.agent.it.harness.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
      org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> METHOD_SHUTDOWN =
      org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void, org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>newBuilder()
          .setType(org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org_glowroot_agent_it_harness.JavaagentService", "shutdown"))
          .setRequestMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .build();
  @org.glowroot.agent.it.harness.shaded.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
      org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> METHOD_KILL =
      org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void, org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>newBuilder()
          .setType(org.glowroot.agent.it.harness.shaded.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org_glowroot_agent_it_harness.JavaagentService", "kill"))
          .setRequestMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .setResponseMarshaller(org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoUtils.marshaller(
              org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JavaagentServiceStub newStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
    return new JavaagentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JavaagentServiceBlockingStub newBlockingStub(
      org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
    return new JavaagentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JavaagentServiceFutureStub newFutureStub(
      org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
    return new JavaagentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JavaagentServiceImplBase implements org.glowroot.agent.it.harness.shaded.grpc.BindableService {

    /**
     */
    public void ping(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     */
    public void executeApp(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE_APP, responseObserver);
    }

    /**
     */
    public void interruptApp(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INTERRUPT_APP, responseObserver);
    }

    /**
     */
    public void setSlowThresholdToZero(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_SLOW_THRESHOLD_TO_ZERO, responseObserver);
    }

    /**
     */
    public void resetConfig(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESET_CONFIG, responseObserver);
    }

    /**
     */
    public void shutdown(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SHUTDOWN, responseObserver);
    }

    /**
     */
    public void kill(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_KILL, responseObserver);
    }

    @java.lang.Override public final org.glowroot.agent.it.harness.shaded.grpc.ServerServiceDefinition bindService() {
      return org.glowroot.agent.it.harness.shaded.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_EXECUTE_APP,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName,
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>(
                  this, METHODID_EXECUTE_APP)))
          .addMethod(
            METHOD_INTERRUPT_APP,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>(
                  this, METHODID_INTERRUPT_APP)))
          .addMethod(
            METHOD_SET_SLOW_THRESHOLD_TO_ZERO,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>(
                  this, METHODID_SET_SLOW_THRESHOLD_TO_ZERO)))
          .addMethod(
            METHOD_RESET_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>(
                  this, METHODID_RESET_CONFIG)))
          .addMethod(
            METHOD_SHUTDOWN,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>(
                  this, METHODID_SHUTDOWN)))
          .addMethod(
            METHOD_KILL,
            asyncUnaryCall(
              new MethodHandlers<
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void,
                org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>(
                  this, METHODID_KILL)))
          .build();
    }
  }

  /**
   */
  public static final class JavaagentServiceStub extends org.glowroot.agent.it.harness.shaded.grpc.stub.AbstractStub<JavaagentServiceStub> {
    private JavaagentServiceStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
      super(channel);
    }

    private JavaagentServiceStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaagentServiceStub build(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      return new JavaagentServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeApp(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_APP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void interruptApp(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INTERRUPT_APP, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setSlowThresholdToZero(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_SLOW_THRESHOLD_TO_ZERO, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetConfig(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESET_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shutdown(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SHUTDOWN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void kill(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request,
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_KILL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JavaagentServiceBlockingStub extends org.glowroot.agent.it.harness.shaded.grpc.stub.AbstractStub<JavaagentServiceBlockingStub> {
    private JavaagentServiceBlockingStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
      super(channel);
    }

    private JavaagentServiceBlockingStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaagentServiceBlockingStub build(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      return new JavaagentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void ping(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     */
    public org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void executeApp(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE_APP, getCallOptions(), request);
    }

    /**
     */
    public org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void interruptApp(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INTERRUPT_APP, getCallOptions(), request);
    }

    /**
     */
    public org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void setSlowThresholdToZero(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_SLOW_THRESHOLD_TO_ZERO, getCallOptions(), request);
    }

    /**
     */
    public org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void resetConfig(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESET_CONFIG, getCallOptions(), request);
    }

    /**
     */
    public org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void shutdown(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SHUTDOWN, getCallOptions(), request);
    }

    /**
     */
    public org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void kill(org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return blockingUnaryCall(
          getChannel(), METHOD_KILL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JavaagentServiceFutureStub extends org.glowroot.agent.it.harness.shaded.grpc.stub.AbstractStub<JavaagentServiceFutureStub> {
    private JavaagentServiceFutureStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel) {
      super(channel);
    }

    private JavaagentServiceFutureStub(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaagentServiceFutureStub build(org.glowroot.agent.it.harness.shaded.grpc.Channel channel,
        org.glowroot.agent.it.harness.shaded.grpc.CallOptions callOptions) {
      return new JavaagentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> ping(
        org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> executeApp(
        org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_APP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> interruptApp(
        org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INTERRUPT_APP, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> setSlowThresholdToZero(
        org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_SLOW_THRESHOLD_TO_ZERO, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> resetConfig(
        org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESET_CONFIG, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> shutdown(
        org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SHUTDOWN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void> kill(
        org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_KILL, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_EXECUTE_APP = 1;
  private static final int METHODID_INTERRUPT_APP = 2;
  private static final int METHODID_SET_SLOW_THRESHOLD_TO_ZERO = 3;
  private static final int METHODID_RESET_CONFIG = 4;
  private static final int METHODID_SHUTDOWN = 5;
  private static final int METHODID_KILL = 6;

  private static final class MethodHandlers<Req, Resp> implements
      org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      org.glowroot.agent.it.harness.shaded.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JavaagentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JavaagentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void) request,
              (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>) responseObserver);
          break;
        case METHODID_EXECUTE_APP:
          serviceImpl.executeApp((org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.AppUnderTestClassName) request,
              (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>) responseObserver);
          break;
        case METHODID_INTERRUPT_APP:
          serviceImpl.interruptApp((org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void) request,
              (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>) responseObserver);
          break;
        case METHODID_SET_SLOW_THRESHOLD_TO_ZERO:
          serviceImpl.setSlowThresholdToZero((org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void) request,
              (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>) responseObserver);
          break;
        case METHODID_RESET_CONFIG:
          serviceImpl.resetConfig((org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void) request,
              (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>) responseObserver);
          break;
        case METHODID_SHUTDOWN:
          serviceImpl.shutdown((org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void) request,
              (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>) responseObserver);
          break;
        case METHODID_KILL:
          serviceImpl.kill((org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void) request,
              (org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.Void>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<Req> invoke(
        org.glowroot.agent.it.harness.shaded.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class JavaagentServiceDescriptorSupplier implements org.glowroot.agent.it.harness.shaded.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.glowroot.agent.it.harness.grpc.JavaagentServiceOuterClass.getDescriptor();
    }
  }

  private static volatile org.glowroot.agent.it.harness.shaded.grpc.ServiceDescriptor serviceDescriptor;

  public static org.glowroot.agent.it.harness.shaded.grpc.ServiceDescriptor getServiceDescriptor() {
    org.glowroot.agent.it.harness.shaded.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JavaagentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = org.glowroot.agent.it.harness.shaded.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JavaagentServiceDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_EXECUTE_APP)
              .addMethod(METHOD_INTERRUPT_APP)
              .addMethod(METHOD_SET_SLOW_THRESHOLD_TO_ZERO)
              .addMethod(METHOD_RESET_CONFIG)
              .addMethod(METHOD_SHUTDOWN)
              .addMethod(METHOD_KILL)
              .build();
        }
      }
    }
    return result;
  }
}
