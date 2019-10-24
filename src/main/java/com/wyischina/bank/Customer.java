package com.wyischina.bank;

public class Customer {
    String name;
    Account savingAccount;
    Account currentAccount;

    public int getTotalBalance () {

        int total = 0;

        if (savingAccount != null) {
            total = total + savingAccount.getBalance();
        } else if (currentAccount != null) {
            total = total + currentAccount.getBalance();
        }
         return total = savingAccount.getBalance() + currentAccount.getBalance();
    }

    public void setSavingAccount (Account acc) {
        this.savingAccount = acc;
    }

    public void setCurrentAccount (Account acc) {
        this.currentAccount = acc;
    }

}
