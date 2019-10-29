package com.wyischina.bank;

public class Account {

    private int balance = 0;

    public void addTransaction(Transaction t) {
        if (t.isDebit) {
            balance = balance + t.amount;
        } else {
            balance = balance - t.amount;
        }
    }

    public int getBalance() {
        return balance;
    }

}
