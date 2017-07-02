package com.example.michaelrobertson.puggy;

import java.util.Scanner;

/**
 * Created by michaelrobertson on 01/07/2017.
 */

public class Puggy {

    Spin spin;
    Machine machine;
    Player player;
    Puggy game;

    public Puggy() {
        spin = new Spin();
        machine = new Machine();
        player = new Player();
    }

    public void preGame() {
        System.out.println("Would you like to play a game?");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine().toUpperCase();
        if(ans.equals("YES")){
            play();
        }
    }

    public void play() {

//        player runs spinner
//        this takes one from their pocketMoney and puts in into the Puggy bank
//        player is shown result and if they've won


        player.playerPaysToSpin();
        System.out.println("Player has " + player.getPocketMoney() + " golden nuggets remaining.");
        machine.coinGoesToPuggyBank();

        Slot slot = machine.getSlotSymbol();
//        machine.spin.addToSlot(Spin spin);
        System.out.println(spin.spin1Result());
        System.out.println(spin.spin2Result());
        System.out.println(spin.spin3Result());
    }


}
