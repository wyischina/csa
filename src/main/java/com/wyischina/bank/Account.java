package com.wyischina.bank;

public class Account {

    private int balance;

    public void addTransaction(Transaction t) {
        if (t.IsDebt){
            this.balance = this.balance - t.amount;
        } else {
            this.balance = this.balance + t.amount;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
