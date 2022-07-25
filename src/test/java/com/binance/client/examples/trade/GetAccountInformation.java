package com.binance.client.examples.trade;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;

public class GetAccountInformation {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create("alvcroI64hrFWrxO64jHAg1XqzwQSMXQ9HhYDfiBR127yB8F4Xi7K3QJ2GnB672u", "i8oVZuz56j6L8xOTqAIZzzzKKlWFE2F799uI9rSeJ9aYkRwcu3IuEOFbCOKBEeD6",
                options);
        System.out.println(syncRequestClient.getAccountInformation());
    }
}
