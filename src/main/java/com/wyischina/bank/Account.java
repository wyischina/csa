package com.wyischina.bank;

public class Account {
    int balance;

    public void addTransaction (Transaction t) {
        if (t.isDebit) {
           balance = balance + t.amount;
        }
        else {
            balance = balance - t.amount;
        }
    }

    public int getBalance () {
        return balance;
    }
}
