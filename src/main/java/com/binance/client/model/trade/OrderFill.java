package com.binance.client.model.trade;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class OrderFill {

    private BigDecimal price;

    private BigDecimal qty;

    private BigDecimal commission;

    private String commissionAsset;

}
