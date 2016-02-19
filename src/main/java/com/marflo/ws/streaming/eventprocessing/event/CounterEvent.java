package com.marflo.ws.streaming.eventprocessing.event;

import java.math.BigDecimal;

public class CounterEvent {
    private String id;
    private BigDecimal amount;

    public CounterEvent(String id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
