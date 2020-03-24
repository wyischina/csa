package com.wyischina.bank;

public class Account {

    private double balance;

    public void addTransaction(Transaction t){
        if (t.isDebit) {
            this.balance -= t.amount;
        } else {
            this.balance += t.amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
