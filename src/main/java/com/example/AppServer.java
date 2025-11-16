package com.example;

import com.example.auth.AuthServiceImpl;
import com.example.menu.MenuServiceImpl;
import com.example.order.OrderServiceImpl;
import com.example.payment.PaymentServiceImpl;
import com.example.user.UserServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class AppServer {

    public static void main(String[] args) throws Exception {

        Server server = ServerBuilder
                .forPort(9001)
                .addService(new AuthServiceImpl())
                .addService(new UserServiceImpl())
                .addService(new MenuServiceImpl())
                .addService(new PaymentServiceImpl())
                .addService(new OrderServiceImpl())
                .build();

        server.start();
        System.out.println("🔥 Java gRPC Core Service started on port 9001");
        server.awaitTermination();
    }
}
