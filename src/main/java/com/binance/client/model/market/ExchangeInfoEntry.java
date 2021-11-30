package com.binance.client.model.market;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ExchangeInfoEntry {

    private String symbol;

    private String status;

    private String baseAsset;

    private Long baseAssetPrecision;

    private String quoteAsset;

    private Long quotePrecision;

    private Long quoteAssetPrecision;

    private List<String> orderTypes;

    private List<Map<String, String>> filters;

}
