package com.binance.client.model.market;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Trade {

    private Long id;

    private BigDecimal price;

    private BigDecimal qty;

    private BigDecimal quoteQty;

    private Long time;

    private Boolean isBuyerMaker;

    private Boolean isBestMatch;

}
