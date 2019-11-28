package com.wyischina.bank;

import java.util.Scanner;

public class Customer{
    public String name;
    public String nameOfCustomer;

    private Account currentAccount;
    private Account savingAccount;

    public int getTotalBalance(){
        if(currentAccount == null){
            return savingAccount.getBalance();
        }
        if(savingAccount == null){
            return currentAccount.getBalance();
        }
        return currentAccount.getBalance() + savingAccount.getBalance();
    }

    public void setSavingAccount(Account savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }
}
