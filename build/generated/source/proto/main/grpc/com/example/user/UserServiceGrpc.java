package com.example.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.user.GetProfileRequest,
      com.example.user.GetProfileResponse> getGetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfile",
      requestType = com.example.user.GetProfileRequest.class,
      responseType = com.example.user.GetProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.user.GetProfileRequest,
      com.example.user.GetProfileResponse> getGetProfileMethod() {
    io.grpc.MethodDescriptor<com.example.user.GetProfileRequest, com.example.user.GetProfileResponse> getGetProfileMethod;
    if ((getGetProfileMethod = UserServiceGrpc.getGetProfileMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetProfileMethod = UserServiceGrpc.getGetProfileMethod) == null) {
          UserServiceGrpc.getGetProfileMethod = getGetProfileMethod =
              io.grpc.MethodDescriptor.<com.example.user.GetProfileRequest, com.example.user.GetProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.user.GetProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.user.GetProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetProfile"))
              .build();
        }
      }
    }
    return getGetProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.user.ListAddressesRequest,
      com.example.user.ListAddressesResponse> getListAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAddresses",
      requestType = com.example.user.ListAddressesRequest.class,
      responseType = com.example.user.ListAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.user.ListAddressesRequest,
      com.example.user.ListAddressesResponse> getListAddressesMethod() {
    io.grpc.MethodDescriptor<com.example.user.ListAddressesRequest, com.example.user.ListAddressesResponse> getListAddressesMethod;
    if ((getListAddressesMethod = UserServiceGrpc.getListAddressesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListAddressesMethod = UserServiceGrpc.getListAddressesMethod) == null) {
          UserServiceGrpc.getListAddressesMethod = getListAddressesMethod =
              io.grpc.MethodDescriptor.<com.example.user.ListAddressesRequest, com.example.user.ListAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.user.ListAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.user.ListAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListAddresses"))
              .build();
        }
      }
    }
    return getListAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.user.AddAddressRequest,
      com.example.user.AddAddressResponse> getAddAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAddress",
      requestType = com.example.user.AddAddressRequest.class,
      responseType = com.example.user.AddAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.user.AddAddressRequest,
      com.example.user.AddAddressResponse> getAddAddressMethod() {
    io.grpc.MethodDescriptor<com.example.user.AddAddressRequest, com.example.user.AddAddressResponse> getAddAddressMethod;
    if ((getAddAddressMethod = UserServiceGrpc.getAddAddressMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddAddressMethod = UserServiceGrpc.getAddAddressMethod) == null) {
          UserServiceGrpc.getAddAddressMethod = getAddAddressMethod =
              io.grpc.MethodDescriptor.<com.example.user.AddAddressRequest, com.example.user.AddAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.user.AddAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.user.AddAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddAddress"))
              .build();
        }
      }
    }
    return getAddAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProfile(com.example.user.GetProfileRequest request,
        io.grpc.stub.StreamObserver<com.example.user.GetProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfileMethod(), responseObserver);
    }

    /**
     */
    default void listAddresses(com.example.user.ListAddressesRequest request,
        io.grpc.stub.StreamObserver<com.example.user.ListAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAddressesMethod(), responseObserver);
    }

    /**
     */
    default void addAddress(com.example.user.AddAddressRequest request,
        io.grpc.stub.StreamObserver<com.example.user.AddAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAddressMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProfile(com.example.user.GetProfileRequest request,
        io.grpc.stub.StreamObserver<com.example.user.GetProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAddresses(com.example.user.ListAddressesRequest request,
        io.grpc.stub.StreamObserver<com.example.user.ListAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addAddress(com.example.user.AddAddressRequest request,
        io.grpc.stub.StreamObserver<com.example.user.AddAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.user.GetProfileResponse getProfile(com.example.user.GetProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.user.ListAddressesResponse listAddresses(com.example.user.ListAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.user.AddAddressResponse addAddress(com.example.user.AddAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.user.GetProfileResponse> getProfile(
        com.example.user.GetProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.user.ListAddressesResponse> listAddresses(
        com.example.user.ListAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.user.AddAddressResponse> addAddress(
        com.example.user.AddAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROFILE = 0;
  private static final int METHODID_LIST_ADDRESSES = 1;
  private static final int METHODID_ADD_ADDRESS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((com.example.user.GetProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.example.user.GetProfileResponse>) responseObserver);
          break;
        case METHODID_LIST_ADDRESSES:
          serviceImpl.listAddresses((com.example.user.ListAddressesRequest) request,
              (io.grpc.stub.StreamObserver<com.example.user.ListAddressesResponse>) responseObserver);
          break;
        case METHODID_ADD_ADDRESS:
          serviceImpl.addAddress((com.example.user.AddAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.example.user.AddAddressResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.user.GetProfileRequest,
              com.example.user.GetProfileResponse>(
                service, METHODID_GET_PROFILE)))
        .addMethod(
          getListAddressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.user.ListAddressesRequest,
              com.example.user.ListAddressesResponse>(
                service, METHODID_LIST_ADDRESSES)))
        .addMethod(
          getAddAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.user.AddAddressRequest,
              com.example.user.AddAddressResponse>(
                service, METHODID_ADD_ADDRESS)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.user.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetProfileMethod())
              .addMethod(getListAddressesMethod())
              .addMethod(getAddAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
