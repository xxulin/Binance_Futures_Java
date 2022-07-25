package com.binance.client.examples.trade;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.trade.MyTrade;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetAccountTrades {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create("alvcroI64hrFWrxO64jHAg1XqzwQSMXQ9HhYDfiBR127yB8F4Xi7K3QJ2GnB672u", "i8oVZuz56j6L8xOTqAIZzzzKKlWFE2F799uI9rSeJ9aYkRwcu3IuEOFbCOKBEeD6",
                options);
        List<MyTrade> trades = syncRequestClient.getAccountTrades("SANDUSDT", null, null, null, null);
        Collections.reverse(trades);

        List<MyTrade> newList = new ArrayList<>();
        for (MyTrade trade : trades) {

            if(trade.getSide().equals("BUY") && trade.getPositionSide().equals("SHORT")) {
                if(newList.size() > 20) {
                    break;
                } else {
                    newList.clear();
                }
            }

            if(trade.getSide().equals("SELL") && trade.getPositionSide().equals("SHORT")) {
                newList.add(trade);
            }

        }

        BigDecimal lprice = BigDecimal.ZERO;
        BigDecimal totalQuantity = BigDecimal.ZERO;
        BigDecimal lava = BigDecimal.ZERO;
        BigDecimal percent = BigDecimal.ZERO;

        Collections.reverse(newList);

        for (MyTrade trade : newList) {
            BigDecimal ava = totalQuantity.multiply(lava).add(trade.getQuoteQty()).divide(totalQuantity.add(trade.getQty()), 5, RoundingMode.HALF_DOWN);
            System.out.println("时间: " + LocalDateTime.ofInstant(Instant.ofEpochMilli(trade.getTime()), ZoneId.of("+8")) + "价格: " + trade.getPrice() + ", 数量: " + trade.getQty() + ", 花费: " + trade.getQuoteQty() + ", 均价: " + ava + ", 百分比: " + (lprice.compareTo(BigDecimal.ZERO) == 0? BigDecimal.ZERO: trade.getPrice().subtract(lava).divide(lava, 5, RoundingMode.HALF_DOWN)));
            lava = ava;
            totalQuantity = totalQuantity.add(trade.getQty());
            lprice = trade.getPrice();
        }

    }
}
