package com.binance.client.model.user;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PositionUpdate {

    private String symbol;

    private BigDecimal amount;

    private BigDecimal entryPrice;

    private BigDecimal preFee;

    private BigDecimal unrealizedPnl;

    private String positionSide;

    private BigDecimal maintMargin;

}
