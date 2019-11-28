package com.wyischina.blackjack;

public class User {
    int money;
    Card[] userDeck = new Card[12];
    int amountOfCards = 0;
    int totalValue = 0;
    int aces;

    public User(int money){
        this.money = money;
    }

    public int getMoney(){return money;}

    public void addTransaction(int x){
        money = money + x;
    }
    public int getTotalValue(){
        return totalValue;
    }
    public void newUserDeck(){
        userDeck = new Card[12];
        amountOfCards=0;
        totalValue=0;
        aces =0;
    }
    public void addCard(Card x){
        userDeck[amountOfCards] = x;
        amountOfCards++;
        if(x.getNumber() == 1){
            if(totalValue < 21){
                totalValue += 11;
                aces++;
            } else {
                totalValue++;
            }
        } else if(x.getNumber() >10){
            totalValue += 10;
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
        String stringCards= "";
        for(int i = 0; i < amountOfCards; i++){
            stringCards += this.userDeck[i].toString() +"  ";
        }
        return stringCards;
    }
}
