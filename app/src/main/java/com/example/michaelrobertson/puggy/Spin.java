package com.example.michaelrobertson.puggy;

import java.util.ArrayList;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class Spin {

    ArrayList<Slot> spin1;
    ArrayList<Slot> spin2;
    ArrayList<Slot> spin3;

    public Spin () {
        this.spin1 = new ArrayList<Slot>();
        this.spin2 = new ArrayList<Slot>();
        this.spin3 = new ArrayList<Slot>();
    }

    public void addToSlot(Slot slot) {
        spin1.add(slot);
        spin2.add(slot);
        spin3.add(slot);
    }

    public ArrayList<Slot> spin1Result() {
        return spin1;
    }

    public ArrayList<Slot> spin2Result() {
        return spin2;
    }

    public ArrayList<Slot> spin3Result() {
        return spin3;
    }

    public int getSpinValue() {
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        for (Slot slot : spin1){
            total1 += slot.symbolValue();
        }
        for (Slot slot : spin2){
            total2 += slot.symbolValue();
        }
        for (Slot slot : spin3){
            total3 += slot.symbolValue();
        }
        return total1 + total2 + total3;
    }
}
