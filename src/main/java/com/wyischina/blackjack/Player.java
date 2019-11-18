package com.wyischina.blackjack;

public class Player {
    private int money;
    Hand hand = new Hand();
    Strategy strategy;

    public Player(int money){
        this.money = money;
    }

    public Player(int money, Strategy strategy){
        this.money = money;
        this.strategy = strategy;
    }

    public void addMoney(int p){
        this.money += p;
    }

    public int getMoney(){
        return this.money;
    }

    public Move getNextMove(){
        return this.strategy.getNextMove(this.hand);
    }

    public int getBet(){
        return this.strategy.getBet();
    }

    public String revealHand() {
        return null;
    }

    public void addCard(Card card){
        this.hand.addCard(card);
    }
}
