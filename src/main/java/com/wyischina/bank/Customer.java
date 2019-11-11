package com.wyischina.bank;

public class Customer {
    private String nameOfCustomer;
    private Account savingAccount;
    private Account currentAccount;

    public int getTotalBalance() {
        int total = 0;
        if (savingAccount != null){
            total = currentAccount.getBalance()+savingAccount.getBalance();
        }

        if(currentAccount != null){
            total = currentAccount.getBalance()+savingAccount.getBalance();
        }

        return total;

    }
    public void setSavingAccount(Account savingAccount){
        this.savingAccount = savingAccount;
    }

    public void setCurrentAccount(Account currentAccount){
        this.currentAccount = currentAccount;
    }
}
