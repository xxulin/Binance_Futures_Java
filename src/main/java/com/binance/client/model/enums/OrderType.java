package com.binance.client.model.enums;

import com.binance.client.impl.utils.EnumLookup;

/**
 * buy-market, sell-market, buy-limit, buy-ioc, sell-ioc,
 * buy-limit-maker, sell-limit-maker, buy-stop-limit, sell-stop-limit.
 */
public enum OrderType {
    LIMIT("LIMIT", "限价单"),
    MARKET("MARKET", "市价单"),
    STOP_LOSS("STOP_LOSS", "止损单"),
    STOP_LOSS_LIMIT("STOP_LOSS_LIMIT", "限价止损单"),
    TAKE_PROFIT("TAKE_PROFIT", "止盈单"),
    TAKE_PROFIT_LIMIT("TAKE_PROFIT_LIMIT", "限价止盈单"),
    LIMIT_MAKER("LIMIT_MAKER", "限价只挂单");

    private final String code;

    private final String desc;

    OrderType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return code;
    }

    private static final EnumLookup<OrderType> lookup = new EnumLookup<>(OrderType.class);

    public static OrderType lookup(String name) {
        return lookup.lookup(name);
    }

}
