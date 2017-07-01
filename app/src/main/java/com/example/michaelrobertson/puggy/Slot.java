package com.example.michaelrobertson.puggy;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class Slot {

    Symbol symbol;

    public Slot(Symbol symbol){
        this.symbol = symbol;
    }

    public int symbolValue() {
        return symbol.getValue();
    }
}
