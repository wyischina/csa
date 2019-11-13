package com.wyischina.blackjack;

public class Card {
    String Suit = null;
    int value = 0;

    public void insertSuit(String x){
        Suit = x;
    }
    public void insertValue(int y){
        value = y;
    }
    public int getValue(){
        return this.value;
    }
    public String getSuit(){
        return this.Suit;
    }
    public String toString() {
        return null;
    }
}
