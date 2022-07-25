package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;
import com.binance.client.model.market.OrderBookEntry;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SubscribeDiffDepth {

    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        Map<String, Integer> map = new HashMap<>();
        map.put("w1", 0);

        client.subscribeDiffDepthEvent("btcusdt", ((event) -> {
            OrderBookEntry bid = event.getBids().get(0);
            OrderBookEntry ask = event.getAsks().get(0);
            if (bid.getQty().compareTo(BigDecimal.ZERO) == 0 || ask.getQty().compareTo(BigDecimal.ZERO) == 0) {
                return;
            }
            System.out.println(ask.getPrice().subtract(bid.getPrice()).divide(bid.getPrice(), 5, BigDecimal.ROUND_HALF_UP));
        }), System.out::println);

    }

}
