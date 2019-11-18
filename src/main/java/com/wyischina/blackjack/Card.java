package com.wyischina.blackjack;

public class Card {
    private Rank value;
    private Suit suit;

    public Card(Rank value, Suit suit) {
        this.suit = suit;
        this.value = value;

    }

    public int getValue(){
        return this.value.ordinal()+1;
    }

    @Override
    public String toString(){
        String suitString;
        if(this.suit == Suit.Club){
            suitString = "♣";
        } else if(this.suit == Suit.Diamond){
            suitString = "♦";
        } else if(this.suit == Suit.Heart){
            suitString = "♥";
        } else {
            suitString = "♠";
        }

        return suitString + " " + this.value;
    }
}
