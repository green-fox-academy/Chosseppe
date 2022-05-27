package com.greenfoxaccademy.frontend.models;

import lombok.Data;

@Data
public class Doubling {

    private Integer result;
    private Integer received;

    public Doubling(Integer received) {
        this.result = received * 2;
        this.received = received;
    }

    public Doubling() {
    }
}
