package com.binance.client.model.user;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class OrderUpdate {

    private String symbol;

    private String clientOrderId;

    private String side;

    private String type;

    private String timeInForce;

    private BigDecimal origQty;

    private BigDecimal price;

    private String executionType;

    private String orderStatus;

    private Long orderId;

    private BigDecimal lastFilledQty;

    private BigDecimal cumulativeFilledQty;

    private BigDecimal lastFilledPrice;

    private String commissionAsset;

    private BigDecimal commissionAmount;

    private Long orderTradeTime;

    private Long tradeID;

    private Boolean isMarkerSide;

}
