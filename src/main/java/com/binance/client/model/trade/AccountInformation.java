package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class AccountInformation {

    private BigDecimal makerCommission;

    private BigDecimal takerCommission;

    private BigDecimal buyerCommission;

    private BigDecimal sellerCommission;

    private Boolean canTrade;

    private Boolean canWithdraw;

    private Boolean canDeposit;

    private Long updateTime;

    private String accountType;

    private List<Balance> balances;

}
