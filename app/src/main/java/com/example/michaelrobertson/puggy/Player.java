package com.example.michaelrobertson.puggy;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class Player {

    Spin spin;
    int pocketMoney = 10;

    public Player() {
        this.pocketMoney = pocketMoney;
        this.spin = new Spin();
    }



    public Spin showSpinResult() {
        return this.spin;
    }

    public int playerPaysToSpin() {
        return pocketMoney -= 1;
    }




}
