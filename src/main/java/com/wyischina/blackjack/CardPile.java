package com.wyischina.blackjack;

import java.util.Random;

public class CardPile {
    Card[] deck = new Card[52];

    public CardPile(){
        double rawDeck[]= new double[52];
        int x = 0;
        for(double i = 0; i <13; i=i+0.25){
            rawDeck[x] = i;
            x++;
        }
        for(int i = 0; i<52; i++){
            deck[i]= new Card(((int)rawDeck[i])+1, rawDeck[i]-(int)rawDeck[i]);
        }
    }

    public Card drawCard(){
        Card temporary = null;
        Random random = new Random();
        int x=0;
        do {
            x = random.nextInt(52);
        }while(deck[x]==null);
        temporary = deck[x];
        deck[x] = null;
        return temporary;
    }

}
