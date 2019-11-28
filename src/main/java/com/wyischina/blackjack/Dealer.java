package com.wyischina.blackjack;

public class Dealer {
    Card[] dealerCard = new Card[0];
    int total;
    int index = 0;

    public static Card[] addArray(Card[] list) {
        Card[] newList = new Card[list.length+1];
        for (int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        return newList;
    }

    public void dealerDraw(Deck deck) {
        this.dealerCard = addArray(dealerCard);
        Card drawDeck = deck.draw();
        int x = drawDeck.getValue();
        dealerCard[index] = drawDeck;
        total = total + x;
        index++;
    }

    public int getDealerTotal() {
        return this.total;
    }
}
