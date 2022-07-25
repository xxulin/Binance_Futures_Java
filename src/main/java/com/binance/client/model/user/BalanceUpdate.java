package com.binance.client.model.user;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class BalanceUpdate {

    private String asset;

    private BigDecimal freeStock;

    private BigDecimal lockedStock;

}
