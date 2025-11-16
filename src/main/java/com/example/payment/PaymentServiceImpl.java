package com.example.payment;

import io.grpc.stub.StreamObserver;

public class PaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {

    @Override
    public void createPayment(CreatePaymentRequest request,
                              StreamObserver<CreatePaymentResponse> responseObserver) {

        CreatePaymentResponse response = CreatePaymentResponse.newBuilder()
                .setPaymentId("PAY-" + System.currentTimeMillis())
                .setStatus("PENDING")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getPaymentStatus(GetPaymentStatusRequest request,
                                 StreamObserver<GetPaymentStatusResponse> responseObserver) {

        GetPaymentStatusResponse response = GetPaymentStatusResponse.newBuilder()
                .setPaymentId(request.getPaymentId())
                .setStatus("SUCCESS")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
