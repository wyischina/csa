package com.wyischina.blackjack;

public class Card {
    int number;
    String suit;

    public Card(int number, double suit){
        this.number=number;
        if(suit == 0){
            this.suit = "Club";
        }
        if(suit == 0.25){
            this.suit = "Spade";
        }
        if(suit == 0.5){
            this.suit = "Diamond";
        }
        if(suit == 0.75){
            this.suit = "Heart";
        }
    }

    public String toString(){
        if(number<=10&&number>1) {
            return number + " " + suit;
        } else if(number == 1){
            return "A " + suit;
        } else if(number == 11) {
            return "J " + suit;
        } else if(number ==12) {
            return "Q " + suit;
        }else if(number ==13) {
            return "K " + suit;
        }
        return null;
    }
    public int getNumber(){
        return number;
    }
}
