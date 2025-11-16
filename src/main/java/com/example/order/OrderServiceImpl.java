package com.example.order;

import io.grpc.stub.StreamObserver;

public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    @Override
    public void createOrder(CreateOrderRequest request,
                            StreamObserver<CreateOrderResponse> responseObserver) {

        CreateOrderResponse response = CreateOrderResponse.newBuilder()
                .setOrderId("ORDER-" + System.currentTimeMillis())
                .setStatus("CREATED")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getOrderStatus(GetOrderStatusRequest request,
                               StreamObserver<GetOrderStatusResponse> responseObserver) {

        GetOrderStatusResponse response = GetOrderStatusResponse.newBuilder()
                .setOrderId(request.getOrderId())
                .setStatus("DELIVERING")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
