package com.wyischina.bankAccountExercise;

public class Account{
    int balance;

    public void addTransaction(Transaction t){
        if(t.isDebit){
            this.balance-= t.amount;
        } else{
            this.balance+= t.amount;
        }
    }

    public int getBalance(){
        return balance;
    }
}
