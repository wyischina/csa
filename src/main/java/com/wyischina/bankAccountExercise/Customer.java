package com.wyischina.bankAccountExercise;

public class Customer{
    String name;
    private Account currentAccount;
    private Account savingAccount;

    public int getTotalBalance(){
        int totalBalance;
        return totalBalance = currentAccount.balance + savingAccount.balance;
    }

    public void setSavingAccount(Account acc){
        this.savingAccount = acc;
    }

    public void setCurrentAccount(Account acc){
        this.currentAccount = acc;
    }
}
