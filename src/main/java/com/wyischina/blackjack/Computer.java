package com.wyischina.blackjack;

public class Computer {
    Card[] computerCards = new Card[12];
    int amountOfCards = 0;
    int totalValue = 0;
    int aces= 0;


    public void startGame(Card x, Card y){
        addCard(x);
        addCard(y);
    }
    public int getTotalValue(){
        return totalValue;
    }

    public void addCard(Card x){
        computerCards[amountOfCards] = x;
        amountOfCards++;
        if(x.getNumber() == 1){
            if(totalValue < 21){
                totalValue += 11;
                aces++;
            } else {
                totalValue++;
            }
        } else if(x.getNumber() >10){
            totalValue = totalValue+10;
        }else {
            totalValue += x.getNumber();
        }

        if(totalValue>21 && aces >0){
            totalValue= totalValue - 10;
            aces--;
        }
    }

    public String revealCards(){
        Card anyCard;
        String stringCards = "Hidden ";
        for(int i = 1; i<amountOfCards; i++){
            stringCards += computerCards[i].toString() + "  ";
        }
        return stringCards;
    }
    public void newComputerDeck(){
        computerCards = new Card[12];
        amountOfCards=0;
        totalValue=0;
        aces=0;
    }
    public String finalRevealCards(){
        Card anyCard;
        String stringCards = "";
        for(int i = 0; i<amountOfCards; i++){
            stringCards += computerCards[i].toString() + "  ";
        }
        return stringCards;
    }
}

