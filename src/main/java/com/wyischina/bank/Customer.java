package com.wyischina.bank;

public class Customer {

    private String name;
    private Account setSavingsAccount;
    private Account setCurrentAccount;

    public Customer(String name){
        this.name = name;
    }

    public double getTotalBalance(){
        return this.setSavingsAccount.getBalance() + this.setCurrentAccount.getBalance();
    }

    public void setSavingsAccount(Account acc){
        this.setSavingsAccount = acc;
    }

    public void setCurrentAccount(Account acc){
        this.setCurrentAccount = acc;
    }
}
