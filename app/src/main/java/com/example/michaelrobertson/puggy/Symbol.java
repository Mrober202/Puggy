package com.example.michaelrobertson.puggy;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public enum Symbol {
    LEMON(1),
    BELL(3),
    CHERRY(5),
    SEVEN(7);

     int value;

     Symbol(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
