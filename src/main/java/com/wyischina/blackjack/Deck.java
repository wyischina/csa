package com.wyischina.blackjack;

import java.util.Random;

public class Deck {
    Card[] card = new Card[52];
    int nextCardIndex = -1;

    public void shuffle(){
        String Suit;
        int value;
        int suit;
        for(int k = 0; k < 4; k++) {
            for (int i = 1; i < 14; i++) {
                Random random = new Random();
                value = i;
                suit = k;
                if (suit == 0) {
                    Suit = "spade";
                } else if (suit == 1) {
                    Suit = "diamond";
                } else if (suit == 2) {
                    Suit = "heart";
                } else {
                    Suit = "clover";
                }
                nextCardIndex = -1;
                while (true) {
                    int randomIndex = random.nextInt(52);
                    int x = randomIndex;
                    if (card[x] == null) {
                        Card c = new Card();
                        c.insertValue(value);
                        c.insertSuit(Suit);
                        card[x] = c;
                        break;
                    }
                }
            }
        }
    }

    public Card draw(){
        this.nextCardIndex++;
            return this.card[nextCardIndex];
    }
    public int counter(){
        return nextCardIndex;
    }
}
