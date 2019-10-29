package com.wyischina.bank;

public class Main {

    public static void main(String[] args) {

        Customer johnSmith = new Customer();

        Account saving = new Account();
        Account current = new Account();

        johnSmith.setCurrentAccount(current);
        johnSmith.setSavingAccount(saving);

        Transaction t = new Transaction();
        t.isDebit = false;
        t.amount = 10000;
        saving.addTransaction(t);

        t.isDebit=true;
        t.amount=5000;
        saving.addTransaction(t);

        t.isDebit=false;
        t.amount=8000;
        current.addTransaction(t);

        System.out.println(johnSmith.getTotalBalance());
    }

}
