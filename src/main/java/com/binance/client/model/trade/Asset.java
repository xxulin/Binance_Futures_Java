package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Asset {

    private String asset;

    private BigDecimal unrealizedProfit;

    private BigDecimal initialMargin;

    private BigDecimal marginBalance;

    private BigDecimal maintMargin;

    private BigDecimal positionInitialMargin;

    private BigDecimal openOrderInitialMargin;

    private BigDecimal availableBalance;

    private BigDecimal maxWithdrawAmount;

}
