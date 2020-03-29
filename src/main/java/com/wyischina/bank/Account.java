package com.wyischina.bank;

public class Account {
    private int balance = 0;

    public void addTransaction(Transaction t){
        if (t.isDebit){
            this.balance -= t.amount;
        }else{
            this.balance += t.amount;
        }
    }

    public int getBalance(){
        return this.balance;
    }
}
