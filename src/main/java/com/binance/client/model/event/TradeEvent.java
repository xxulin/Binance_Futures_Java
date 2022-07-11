package com.binance.client.model.event;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class TradeEvent {

    private String eventType;

    private Long eventTime;

    private String symbol;

    private Long id;

    private BigDecimal price;

    private BigDecimal qty;

    private Long buyerOrderId;

    private Long sellerOrderId;

    private Long time;

    private Boolean isBuyerMaker;

}
