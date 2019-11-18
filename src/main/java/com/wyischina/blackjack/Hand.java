package com.wyischina.blackjack;

public class Hand {
    private Card[] cards = new Card[12];
    private int index = 0;
    private int totalPoints = 0;
    private int aceCount = 0;

    public Card[] getCards(){
        return cards;
    }

    public void addCard(Card card) {
        this.cards[index] = card;
        this.index++;
        if(card.getValue() == 1){
            if(this.totalPoints + 11 <= 21){
                this.totalPoints += 11;
            } else{
                this.totalPoints += 1;
            }
        }else if (card.getValue() < 10){
            this.totalPoints += card.getValue();
        }
        else {
            this.totalPoints += 10;
        }

        if(this.totalPoints > 21 && this.aceCount > 0){
            this.totalPoints -= 10;
            aceCount--;
        }
    }

    public int getTotalPoints(){
        return this.totalPoints;
    }

    public int getIndex(){return this.index;}

    @Override
    public String toString(){
        String string = "";
        for(int i = 0; i < index; i++){
            string += cards[i].toString();
            if (i == index-1){
                string += ".";
            } else{
                string += ", ";
            }
        }
        return string;
    }

    public void reset(){
        this.index = 0;
        this.cards = new Card[12];
        this.totalPoints = 0;
    }

    public boolean isEmpty(){
        return index == 0;
    }
}
