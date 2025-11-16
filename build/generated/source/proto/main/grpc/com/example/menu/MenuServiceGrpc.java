package com.example.menu;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: menu.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MenuServiceGrpc {

  private MenuServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "menu.MenuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.menu.ListRestaurantsRequest,
      com.example.menu.ListRestaurantsResponse> getListRestaurantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRestaurants",
      requestType = com.example.menu.ListRestaurantsRequest.class,
      responseType = com.example.menu.ListRestaurantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.menu.ListRestaurantsRequest,
      com.example.menu.ListRestaurantsResponse> getListRestaurantsMethod() {
    io.grpc.MethodDescriptor<com.example.menu.ListRestaurantsRequest, com.example.menu.ListRestaurantsResponse> getListRestaurantsMethod;
    if ((getListRestaurantsMethod = MenuServiceGrpc.getListRestaurantsMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getListRestaurantsMethod = MenuServiceGrpc.getListRestaurantsMethod) == null) {
          MenuServiceGrpc.getListRestaurantsMethod = getListRestaurantsMethod =
              io.grpc.MethodDescriptor.<com.example.menu.ListRestaurantsRequest, com.example.menu.ListRestaurantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRestaurants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.menu.ListRestaurantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.menu.ListRestaurantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("ListRestaurants"))
              .build();
        }
      }
    }
    return getListRestaurantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.menu.ListMenuItemsRequest,
      com.example.menu.ListMenuItemsResponse> getListMenuItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMenuItems",
      requestType = com.example.menu.ListMenuItemsRequest.class,
      responseType = com.example.menu.ListMenuItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.menu.ListMenuItemsRequest,
      com.example.menu.ListMenuItemsResponse> getListMenuItemsMethod() {
    io.grpc.MethodDescriptor<com.example.menu.ListMenuItemsRequest, com.example.menu.ListMenuItemsResponse> getListMenuItemsMethod;
    if ((getListMenuItemsMethod = MenuServiceGrpc.getListMenuItemsMethod) == null) {
      synchronized (MenuServiceGrpc.class) {
        if ((getListMenuItemsMethod = MenuServiceGrpc.getListMenuItemsMethod) == null) {
          MenuServiceGrpc.getListMenuItemsMethod = getListMenuItemsMethod =
              io.grpc.MethodDescriptor.<com.example.menu.ListMenuItemsRequest, com.example.menu.ListMenuItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMenuItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.menu.ListMenuItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.menu.ListMenuItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MenuServiceMethodDescriptorSupplier("ListMenuItems"))
              .build();
        }
      }
    }
    return getListMenuItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MenuServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MenuServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MenuServiceStub>() {
        @java.lang.Override
        public MenuServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MenuServiceStub(channel, callOptions);
        }
      };
    return MenuServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MenuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MenuServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MenuServiceBlockingStub>() {
        @java.lang.Override
        public MenuServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MenuServiceBlockingStub(channel, callOptions);
        }
      };
    return MenuServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MenuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MenuServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MenuServiceFutureStub>() {
        @java.lang.Override
        public MenuServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MenuServiceFutureStub(channel, callOptions);
        }
      };
    return MenuServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listRestaurants(com.example.menu.ListRestaurantsRequest request,
        io.grpc.stub.StreamObserver<com.example.menu.ListRestaurantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRestaurantsMethod(), responseObserver);
    }

    /**
     */
    default void listMenuItems(com.example.menu.ListMenuItemsRequest request,
        io.grpc.stub.StreamObserver<com.example.menu.ListMenuItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMenuItemsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MenuService.
   */
  public static abstract class MenuServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MenuServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MenuService.
   */
  public static final class MenuServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MenuServiceStub> {
    private MenuServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MenuServiceStub(channel, callOptions);
    }

    /**
     */
    public void listRestaurants(com.example.menu.ListRestaurantsRequest request,
        io.grpc.stub.StreamObserver<com.example.menu.ListRestaurantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRestaurantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMenuItems(com.example.menu.ListMenuItemsRequest request,
        io.grpc.stub.StreamObserver<com.example.menu.ListMenuItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMenuItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MenuService.
   */
  public static final class MenuServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MenuServiceBlockingStub> {
    private MenuServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MenuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.menu.ListRestaurantsResponse listRestaurants(com.example.menu.ListRestaurantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRestaurantsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.menu.ListMenuItemsResponse listMenuItems(com.example.menu.ListMenuItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMenuItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MenuService.
   */
  public static final class MenuServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MenuServiceFutureStub> {
    private MenuServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MenuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.menu.ListRestaurantsResponse> listRestaurants(
        com.example.menu.ListRestaurantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRestaurantsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.menu.ListMenuItemsResponse> listMenuItems(
        com.example.menu.ListMenuItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMenuItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_RESTAURANTS = 0;
  private static final int METHODID_LIST_MENU_ITEMS = 1;

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
        case METHODID_LIST_RESTAURANTS:
          serviceImpl.listRestaurants((com.example.menu.ListRestaurantsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.menu.ListRestaurantsResponse>) responseObserver);
          break;
        case METHODID_LIST_MENU_ITEMS:
          serviceImpl.listMenuItems((com.example.menu.ListMenuItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.menu.ListMenuItemsResponse>) responseObserver);
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
          getListRestaurantsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.menu.ListRestaurantsRequest,
              com.example.menu.ListRestaurantsResponse>(
                service, METHODID_LIST_RESTAURANTS)))
        .addMethod(
          getListMenuItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.menu.ListMenuItemsRequest,
              com.example.menu.ListMenuItemsResponse>(
                service, METHODID_LIST_MENU_ITEMS)))
        .build();
  }

  private static abstract class MenuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MenuServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.menu.Menu.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MenuService");
    }
  }

  private static final class MenuServiceFileDescriptorSupplier
      extends MenuServiceBaseDescriptorSupplier {
    MenuServiceFileDescriptorSupplier() {}
  }

  private static final class MenuServiceMethodDescriptorSupplier
      extends MenuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MenuServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MenuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MenuServiceFileDescriptorSupplier())
              .addMethod(getListRestaurantsMethod())
              .addMethod(getListMenuItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
