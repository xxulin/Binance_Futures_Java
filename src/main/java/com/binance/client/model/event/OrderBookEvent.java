package com.binance.client.model.event;

import com.binance.client.model.market.OrderBookEntry;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class OrderBookEvent {

    private String eventType;

    private Long eventTime;

    private String symbol;

    private Long firstUpdateId;

    private Long lastUpdateId;

    private List<OrderBookEntry> bids;

    private List<OrderBookEntry> asks;

}
