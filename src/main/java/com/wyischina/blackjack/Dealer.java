package com.wyischina.blackjack;

import java.util.Random;

public class Dealer extends Player {

    public Dealer(int money, Strategy strategy){
        super(money, strategy);
    }

    @Override
    public String revealHand(){
        String string = "";
        if(!hand.isEmpty()) {
            string = "? ";
        }
        for(int i = 1; i < hand.getIndex(); i++){
            string += hand.getCards()[i].toString();
            if (i == hand.getIndex()-1){
                string += ".";
            } else{
                string += ", ";
            }
        }
        return string;
    }

    public String revealFinalHand(){
        return hand.toString();
    }
}
