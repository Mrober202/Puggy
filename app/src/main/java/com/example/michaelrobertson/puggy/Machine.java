package com.example.michaelrobertson.puggy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class Machine {

    ArrayList<Slot> slots;
    int funds;

    public Machine() {
        this.funds = 100;
        slots = new ArrayList<Slot>();
        populateSlots();
    }

    public int getPuggyBank() {
        return funds;
    }

    public void populateSlots() {
        for(Symbol symbol : Symbol.values()){
            slots.add(new Slot(symbol));
        }
    }

    public Slot getSlotSymbol() {
        return slots.remove(0);
    }

    public void ranodmiseSlot() {
        Collections.shuffle(slots);
    }

    public int coinGoesToPuggyBank() {
        return funds += 1;
    }

    public int lemonJackpot() {
        return funds -= 5;
    }

    public int bellJackpot() {
        return funds -= 10;
    }

    public int cherryJackpot() {
        return funds -= 20;
    }

    public int sevenJackpot() {
        return funds -= 50;
    }
}
