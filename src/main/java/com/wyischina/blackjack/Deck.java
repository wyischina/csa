package com.wyischina.blackjack;

import java.util.Random;

public class Deck {
    private Card[] cardsInDeck = new Card[52];
    private Random rand = new Random();
    private int totalCards;

    public Deck(){
        for(Rank r : Rank.values()){
            for(Suit s : Suit.values()){
                cardsInDeck[r.ordinal()*4 + s.ordinal()] = new Card(r, s);
                totalCards++;
            }
        }
    }

    public Card drawCard(){
        int index;
        totalCards--;
        do {
            index = rand.nextInt(52);
        } while(cardsInDeck[index] == null);

        Card drawn = cardsInDeck[index];
        cardsInDeck[index] = null;
        return drawn;
    }

    public int getTotalCards() {
        return totalCards;
    }
}
