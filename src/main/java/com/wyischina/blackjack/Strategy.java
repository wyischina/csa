package com.wyischina.blackjack;

public interface Strategy {

    public Move getNextMove(Hand hand);

    public int getBet();
}
