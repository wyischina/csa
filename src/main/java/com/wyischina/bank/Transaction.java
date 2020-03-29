package com.wyischina.bank;

public class Transaction {
    public int amount;
    public boolean isDebit;

    public Transaction(int amount, boolean isDebit){
        this.amount = amount;
        this.isDebit = isDebit;
    }

    public Transaction() {

    }
}
