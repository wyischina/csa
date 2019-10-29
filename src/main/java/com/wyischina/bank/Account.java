package com.wyischina.bank;

public class Account {
    private int balance;

    public int getBalance(){
        return balance;
    }

    public void addTransaction(Transaction t){
        if (t.isDebit){
            this.balance -= t.amount;
        } else {
            this.balance += t.amount;
        }
    }
}
