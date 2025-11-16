package com.example.user;

import io.grpc.stub.StreamObserver;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void getProfile(GetProfileRequest request,
                           StreamObserver<GetProfileResponse> responseObserver) {

        GetProfileResponse response = GetProfileResponse.newBuilder()
                .setUserId(request.getUserId())
                .setEmail("john@example.com")
                .setName("John Doe")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listAddresses(ListAddressesRequest request,
                              StreamObserver<ListAddressesResponse> responseObserver) {

        Address a1 = Address.newBuilder()
                .setAddressId("ADDR-1")
                .setFullAddress("123 Main St, Bangkok")
                .build();

        ListAddressesResponse response = ListAddressesResponse.newBuilder()
                .addAddresses(a1)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addAddress(AddAddressRequest request,
                           StreamObserver<AddAddressResponse> responseObserver) {

        AddAddressResponse response = AddAddressResponse.newBuilder()
                .setAddressId("ADDR-" + System.currentTimeMillis())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
