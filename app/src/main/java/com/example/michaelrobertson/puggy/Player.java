package com.example.michaelrobertson.puggy;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class Player {

    Spin spin;
    Machine machine;
    int pocketMoney = 10;

    public Player() {
        this.pocketMoney = pocketMoney;
        this.spin = new Spin();
        this.machine = machine;
    }



    public Spin showSpinResult() {
        return this.spin;
    }

    public int getPocketMoney(){
        return this.pocketMoney;
    }

    public int playerPaysToSpin() {
        return pocketMoney -= 1;
    }

    public int lemonJackpot() {
        return pocketMoney += 5;
    }

    public int bellJackpot() {
        return pocketMoney += 10;
    }

    public int cherryJackpot() {
        return pocketMoney += 20;
    }

    public int sevenJackpot() {
        return pocketMoney += 50;
    }








}
