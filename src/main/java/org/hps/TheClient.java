package org.hps;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TheClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        RateServiceGrpc.RateServiceBlockingStub rateServiceBlockingStub
                = RateServiceGrpc.newBlockingStub(managedChannel);

        RateRequest rateRequest = RateRequest.newBuilder()
                .setRaterequest("Give me your rate")
                .build();

        RateResponse rateResponse = rateServiceBlockingStub.rate(rateRequest);


        System.out.println("Received response: "+ rateResponse.getRateresponse());

        managedChannel.shutdown();
    }
}
