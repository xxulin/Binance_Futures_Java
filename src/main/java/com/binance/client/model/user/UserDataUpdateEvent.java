package com.binance.client.model.user;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDataUpdateEvent {

    private String eventType;

    private Long eventTime;

    private AccountUpdate accountUpdate;

    private OrderUpdate orderUpdate;

}
