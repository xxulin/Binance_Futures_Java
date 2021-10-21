package com.binance.client.model.trade;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString
public class Order {

    private String symbol;

    private Long orderId;

    private String clientOrderId;

    private Long transactTime;

    private BigDecimal price;

    private BigDecimal origQty;

    private BigDecimal executedQty;

    private BigDecimal cummulativeQuoteQty;

    private String status;

    private String timeInForce;

    private String type;

    private String side;

    private List<OrderFill> fillList;

}
