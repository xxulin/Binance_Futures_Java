package com.binance.client.model.trade;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.Objects;

public class Position {

    private Boolean isolated;

    private BigDecimal leverage;

    private BigDecimal initialMargin;

    private BigDecimal maintMargin;

    private BigDecimal openOrderInitialMargin;

    private BigDecimal positionInitialMargin;

    private String symbol;

    private BigDecimal unrealizedProfit;

    private String entryPrice;

    private String maxNotional;

    private String positionSide;

    private BigDecimal positionAmt;

    public Boolean getIsolated() {
        return isolated;
    }

    public void setIsolated(Boolean isolated) {
        this.isolated = isolated;
    }

    public BigDecimal getLeverage() {
        return leverage;
    }

    public void setLeverage(BigDecimal leverage) {
        this.leverage = leverage;
    }

    public BigDecimal getInitialMargin() {
        return initialMargin;
    }

    public void setInitialMargin(BigDecimal initialMargin) {
        this.initialMargin = initialMargin;
    }

    public BigDecimal getMaintMargin() {
        return maintMargin;
    }

    public void setMaintMargin(BigDecimal maintMargin) {
        this.maintMargin = maintMargin;
    }

    public BigDecimal getOpenOrderInitialMargin() {
        return openOrderInitialMargin;
    }

    public void setOpenOrderInitialMargin(BigDecimal openOrderInitialMargin) {
        this.openOrderInitialMargin = openOrderInitialMargin;
    }

    public BigDecimal getPositionInitialMargin() {
        return positionInitialMargin;
    }

    public void setPositionInitialMargin(BigDecimal positionInitialMargin) {
        this.positionInitialMargin = positionInitialMargin;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getUnrealizedProfit() {
        return unrealizedProfit;
    }

    public void setUnrealizedProfit(BigDecimal unrealizedProfit) {
        this.unrealizedProfit = unrealizedProfit;
    }

    public String getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(String entryPrice) {
        this.entryPrice = entryPrice;
    }

    public String getMaxNotional() {
        return maxNotional;
    }

    public void setMaxNotional(String maxNotional) {
        this.maxNotional = maxNotional;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public BigDecimal getPositionAmt() {
        return positionAmt;
    }

    public void setPositionAmt(BigDecimal positionAmt) {
        if (Objects.isNull(positionAmt)) {
            this.positionAmt = BigDecimal.ZERO;
        } else {
            this.positionAmt = positionAmt;
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("initialMargin", initialMargin).append("maintMargin", maintMargin)
                .append("openOrderInitialMargin", openOrderInitialMargin)
                .append("positionInitialMargin", positionInitialMargin).append("symbol", symbol)
                .append("unrealizedProfit", unrealizedProfit).append("entryPrice", entryPrice)
                .append("maxNotional", maxNotional).append("positionSide", positionSide)
                .append("isolated", isolated).append("positionAmt", positionAmt).toString();
    }
}
