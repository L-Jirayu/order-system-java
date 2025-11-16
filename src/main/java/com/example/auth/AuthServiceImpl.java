package com.example.auth;


import io.grpc.stub.StreamObserver;

public class AuthServiceImpl extends AuthServiceGrpc.AuthServiceImplBase {
    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {

        // Sample mock logic
        String token = "token-123";

        LoginResponse response = LoginResponse.newBuilder()
                .setToken(token)
                .setUserId("user-001")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
