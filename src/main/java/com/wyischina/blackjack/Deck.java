package com.wyischina.blackjack;

import java.util.Random;

public class Deck {
    Card[] card = new Card[52];
    int cardIndex = -1;

    public void shuffle() {
        int value = 0;
        int suit = 0;
        String Suit = null;
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            for (int o = 0; o < 14; o++) {
                suit = i;
                value = o;
                if (i == 0) {
                    Suit = "spade";
                } else if (i==1) {
                    Suit = "diamond";
                } else if (i==2) {
                    Suit = "clover";
                } else {
                    Suit = "heart";
                }
            }
            while (true) {
                int randomIndex = random.nextInt(52);
                if (card[randomIndex] == null) {
                    Card c = new Card();
                    c.insertSuit(Suit);
                    c.insertValue(value);
                    card[randomIndex] = c;
                    break;
                }
            }
            while (true) {
                Card d = new Card();
                for (int x = 0; x < card.length; x++) {
                    if (d.getValue() == 12) {
                        d.insertValue(10);
                        d.insertSuit("King");
                    } else if (d.getValue() == 13) {
                        d.insertValue(10);
                        d.insertSuit("Jack");
                    } else if (d.getValue() == 11) {
                        d.insertValue(10);
                        d.insertSuit("Queen");
                    }
                }
                break;
            }
        }
    }

    public Card draw() {
        this.cardIndex++;
        return this.card[cardIndex];
    }


}
