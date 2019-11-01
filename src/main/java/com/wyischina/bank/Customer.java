package com.wyischina.bank;

public class Customer {
    private String name;
    private Account savingAcc;
    private Account currentAcc;

    public Customer(String name){
        this.name = name;
    }

    public int getTotalBalance(){
        if(savingAcc == null){
            return this.currentAcc.getBalance();
        }
        if(currentAcc == null){
            return this.savingAcc.getBalance();
        }
        return this.savingAcc.getBalance() + this.currentAcc.getBalance();
    }

    public void setSavingAccount(Account acc){
        this.savingAcc = acc;
    }

    public void setCurrentAccount(Account acc){
        this.currentAcc = acc;
    }
}