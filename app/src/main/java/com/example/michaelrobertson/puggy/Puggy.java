package com.example.michaelrobertson.puggy;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class Puggy {

    Spin spin;
    Machine machine;
    Player player;

    public Puggy () {
        spin = new Spin();
        machine = new Machine();
        player = new Player();
    }

    public Play() {
//        player runs spinner
//        this takes one from their pocketMoney and puts in into the Puggy bank
//        player is shown result and if they've won
        player.playerPaysToSpin();
        machine.coinGoesToPuggyBank();

        Slot slot = machine.getSlotSymbol();
        player.spin.addToSlot(Spin spin);
    }


}
