package com.wyischina.blackjack;

public class Dealer extends User {
    Card[] dealerCard = new Card[0];
    int dealerTotal = 0;
    int dealerCounter = 0;
    int user = userTotal;
    public String dealerDraw(Deck deck) {
        while (true) {
            //if (dealerTotal < 17) {
            this.dealerCard = addArray(this.dealerCard);
            Card drawDeck = deck.draw();
            this.dealerCard[this.dealerCard.length - 1] = drawDeck;
            int x = drawDeck.getValue();
            dealerTotal = dealerTotal + x;
            if (x == 1 && dealerTotal < 11) {
                dealerTotal = dealerTotal + 10;
                dealerCounter++;
            } else if(x == 11){
                dealerTotal = dealerTotal - 1;
            } else if(x == 12){
                dealerTotal = dealerTotal - 2;
            } else if(x == 13){
                dealerTotal = dealerTotal - 3;
            }
            if (dealerCounter > 0 && dealerTotal > 21) {
                for(int j = 0; j < dealerCounter; j++) {
                    dealerTotal = dealerTotal - 10;
                }
                dealerCounter = 0;
            }
            if (dealerTotal > 16) {
                break;
            }
        }
        if (dealerTotal > 21) {
                return "user won (dealer bust): " + dealerTotal;
        } else {
            if (user > dealerTotal) {
                return "user won. dealer: " + dealerTotal;
            } else if (user < dealerTotal) {
                return "dealer won. dealer: " + dealerTotal;
            } else {
                return "draw. dealer: " + dealerTotal;
            }
        }
    }
    public void dReset(){
        dealerCard = new Card[0];
        dealerTotal = 0;
        dealerCounter = 0;
    }
}