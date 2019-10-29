package com.wyischina.bank;

public class Customer {
    private String name;
    private Account currentAccount;
    private Account savingAccount;

    public String getName(){
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public int getTotalBalance(){
        int total = 0;
        if (this.savingAccount != null){
            total = total + this.savingAccount.getBalance();
        }
        if (this.currentAccount != null){
            total = total + this.currentAccount.getBalance();
        }
        return total;
    }
    public void setSavingAccount(Account acc){
        this.savingAccount = acc;
    }
    public void setCurrentAccount(Account acc){
        this.currentAccount = acc;
    }
}
