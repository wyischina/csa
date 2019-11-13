package com.wyischina.blackjack;

public class User{
    Card[] userCard = new Card[0];
    int userTotal = 0;
    int elevenCounter = 0;


    public static Card[] addArray(Card[] list){
        Card[] newList = new Card[list.length + 1];
        for (int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        return newList;
    }

    public int userDraw(Deck deck) {
        this.userCard = addArray(this.userCard);
        Card drawDeck = deck.draw();
        int x = drawDeck.getValue();
        this.userCard[this.userCard.length - 1] = drawDeck;
        userTotal = userTotal + x;
        if(x == 1 && userTotal < 11){
            userTotal = userTotal + 10;
            elevenCounter++;
        } else if(x == 11){
            userTotal = userTotal - 1;
        } else if(x == 12){
            userTotal = userTotal - 2;
        } else if(x == 13){
            userTotal = userTotal - 3;
        }
        if(elevenCounter > 0 && userTotal > 21){
            userTotal = userTotal - 10;
        }
        return userTotal;
    }

    public void reset(){
        userCard = new Card[0];
        userTotal = 0;
        elevenCounter = 0;
    }

    public String showCard() {
        String s = "";
        for(int i = 0; i < this.userCard.length; i++) {
            Card card = this.userCard[i];
            if (card.getValue() == 1){
                s = s + " (Ace of " + card.getSuit() + ")";
            } else if(card.getValue() == 11){
                s = s + " (Jack of " + card.getSuit() + ")";
            } else if(card.getValue() == 12){
                s = s + " (Queen of " + card.getSuit() + ")";
            } else if(card.getValue() == 13){
                s = s + " (king of " + card.getSuit() + ")";
            } else {
                s = s + " (" + card.getValue() + ":" + card.getSuit() + ")";
            }
        }
        return s;
    }
}