package com.binance.client.examples.market;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.enums.OrderState;

public class GetExchangeInformation {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create("afRPqmqg0V4RUwsHmhXjSefphEUvflDWFfddJDqBL8W0ap3EXuSDNLp4mqJOvhyd", "idlj3KmcJL3HmiSpivJNTHpnmvxKmGSHolIug74JECBW7PuK0bEKCbwSqPeB06P6",
                options);
        System.out.println(OrderState.CREATED.toString());
        System.out.println(syncRequestClient.getAllOrders("BTCUSDT", null, null, null, null));
        //System.out.println(syncRequestClient.getExchangeInformation());
    }
}
