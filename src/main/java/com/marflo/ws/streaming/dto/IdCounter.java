package com.marflo.ws.streaming.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdCounter {
    @JsonProperty
    private String id;
    @JsonProperty
    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
