package com.wyischina.blackjack;

public class AutomaticStrategy implements Strategy {

    public Move getNextMove(Hand hand){
        if (hand.getTotalPoints() < 16) {
            return Move.Hit;
        } else {
            return Move.Stand;
        }
    }

    public int getBet(){
        return 100;
    }

}
