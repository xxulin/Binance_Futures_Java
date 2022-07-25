package com.binance.client.examples.market;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.model.market.OrderBookEntry;
import com.binance.client.model.market.Trade;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import static java.math.BigDecimal.ZERO;

public class GetRecentTrades {
    public static void main(String[] args) throws InterruptedException {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create("afRPqmqg0V4RUwsHmhXjSefphEUvflDWFfddJDqBL8W0ap3EXuSDNLp4mqJOvhyd", "idlj3KmcJL3HmiSpivJNTHpnmvxKmGSHolIug74JECBW7PuK0bEKCbwSqPeB06P6",
                options);


        System.out.println(syncRequestClient.getExchangeInformation(Collections.singletonList("BTCUSDT")));
        List<OrderBookEntry> btcusdt = syncRequestClient.getOrderBook("BTCUSDT", 500).getAsks();
        System.out.println(btcusdt.get(0));
        System.out.println(btcusdt.get(400));

        final AtomicLong lastTradeId = new AtomicLong(0);
        BigDecimal vol = ZERO;

        while (true) {
            // 源代码交易所最大支持100，此处后续有时间可以优化一下
            List<Trade> trades = syncRequestClient.getRecentTrades("BTCUSDT", 500);
            System.out.println(trades);
            BigDecimal curVol = trades.stream()
                    .filter(trade -> trade.getId() > lastTradeId.get())
                    .map(Trade::getQty)
                    .reduce(ZERO, (pre, ele) -> pre.add(ele), BigDecimal::add);

            vol = vol.compareTo(ZERO) == 0 ? curVol : vol.multiply(new BigDecimal("0.7")).add(curVol.multiply(new BigDecimal("0.3"))).setScale(3, RoundingMode.HALF_DOWN);
            lastTradeId.set(trades.get(trades.size() - 1).getId());
            System.out.println("\n" + vol);
            TimeUnit.MILLISECONDS.sleep(500L);
        }
        //System.out.println(syncRequestClient.getRecentTrades("BTCUSDT", null));
    }
}
