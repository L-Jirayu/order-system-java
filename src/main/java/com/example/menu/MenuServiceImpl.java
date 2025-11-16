package com.example.menu;

import io.grpc.stub.StreamObserver;

public class MenuServiceImpl extends MenuServiceGrpc.MenuServiceImplBase {

    @Override
    public void listRestaurants(ListRestaurantsRequest request,
                                StreamObserver<ListRestaurantsResponse> responseObserver) {

        Restaurant r1 = Restaurant.newBuilder()
                .setRestaurantId("R001")
                .setName("KFC")
                .build();

        Restaurant r2 = Restaurant.newBuilder()
                .setRestaurantId("R002")
                .setName("McDonald's")
                .build();

        ListRestaurantsResponse response = ListRestaurantsResponse.newBuilder()
                .addRestaurants(r1)
                .addRestaurants(r2)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listMenuItems(ListMenuItemsRequest request,
                              StreamObserver<ListMenuItemsResponse> responseObserver) {

        MenuItem item = MenuItem.newBuilder()
                .setItemId("ITEM-100")
                .setRestaurantId(request.getRestaurantId())
                .setName("Beef Burger")
                .setPrice(129.0)
                .build();

        ListMenuItemsResponse response = ListMenuItemsResponse.newBuilder()
                .addItems(item)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
