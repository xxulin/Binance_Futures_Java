package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Balance {

    private String asset;

    private BigDecimal free;

    private BigDecimal locked;

}
