package com.wyischina.bankAccountExercise;

class Transaction {
    int amount;
    boolean isDebit;

    Transaction(int money, boolean isDebit){
        this.amount = money;
        this.isDebit = isDebit;
    }
}
