package com.wyischina.blackjack;

public class User {
    Card[] userCard = new Card[0];
    int total = 0;
    int index = 0;

    public static Card[] addArray(Card[] list) {
        Card[] newList = new Card[list.length+1];
        for (int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        return newList;
    }

    public int userDraw(Deck deck) {
        this.userCard = addArray(this.userCard);
        Card drawDeck = deck.draw();
        int x = drawDeck.getValue();
        userCard[index] = drawDeck;
        total = total + x;

        index++;
        return 0;
    }
    public int getUserTotal() {
        return this.total;
    }

}
