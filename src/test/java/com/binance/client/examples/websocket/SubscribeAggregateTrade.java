package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;
import com.binance.client.model.event.TradeEvent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SubscribeAggregateTrade {

    public static void main(String[] args) throws InterruptedException {

        SubscriptionClient client = SubscriptionClient.create();

        LinkedList<TradeEvent> tradeList = new LinkedList<>();

        client.subscribeTradeEvent("btcusdt", ((event) -> {
            if (tradeList.size() >= 500) {
                tradeList.removeFirst();
            }
            tradeList.add(event);
        }), null);

        TimeUnit.SECONDS.sleep(5);
        for (int i = 0; i < 500; i++) {
            TimeUnit.MILLISECONDS.sleep(100);
            LinkedList<TradeEvent> cloneList = (LinkedList<TradeEvent>) tradeList.clone();
            System.out.println(cloneList.stream().map(TradeEvent::getQty).reduce(BigDecimal.ZERO, (total, now) -> total.add(now), BigDecimal::add));
        }

        System.out.println(tradeList.size());

    }

}
