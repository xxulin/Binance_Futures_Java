package com.binance.client.model.user;

import lombok.Data;

@Data
public class UserDataUpdateEvent {

    private String eventType;

    private Long eventTime;

    private Long transactionTime;

    private AccountUpdate accountUpdate;

    private OrderUpdate orderUpdate;

    private boolean validatedKey = true;

}
