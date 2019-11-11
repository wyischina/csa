package com.wyischina.bank;

public class Main {

    public static void main(String[] args) {
        Customer johnSmith = new Customer();
        Account savingAccount = new Account();
        Account currentAccount = new Account();

        johnSmith.setCurrentAccount(currentAccount);
        johnSmith.setSavingAccount(savingAccount);

        Transaction t = new Transaction();
        t.amount = 10000;
        t.isDebit = false;
        savingAccount.addTransaction(t);

        t.amount = 5000;
        t.isDebit = true;
        savingAccount.addTransaction(t);

        t.amount = 8000;
        t.isDebit = false;
        currentAccount.addTransaction(t);

        System.out.println(johnSmith.getTotalBalance());


    }


}
