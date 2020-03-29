package com.wyischina.blackjack;

import java.util.Scanner;

public class User extends Player {

    public User(int money, Strategy strategy){
        super(money, strategy);
    }

    @Override
    public String revealHand(){
        return hand.toString();
    }
}
