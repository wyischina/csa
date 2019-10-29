package com.wyischina.bank;

public class BankAccountExercise {

    public static void main(String[] args) {
        //set name to John Smith
        Customer c1 = new Customer();
        c1.setName("John Smith");

        // add a saving and current account to the newly created customer;
        Account current = new Account();
        Account saving = new Account();
        c1.setCurrentAccount(current);
        c1.setSavingAccount(saving);

        //add credit transaction 10000 to saving account
        Transaction t = new Transaction();
        t.amount = 10000;
        t.IsDebt = false;
        saving.addTransaction(t);
        System.out.println("saving account balance: " + saving.getBalance());

        //add debt transaction 5000 to saving account
        Transaction t1 = new Transaction();
        t1.amount = 5000;
        t1.IsDebt = true;
        saving.addTransaction(t1);
        System.out.println("saving account balance: " + saving.getBalance());

        //add credit transaction 8000 to current account
        Transaction t2 = new Transaction();
        t2.amount = 8000;
        t2.IsDebt = false;
        current.addTransaction(t2);
        System.out.println("current account balance: " + current.getBalance());

        //print out total balance
        System.out.println("total balance: " + c1.getTotalBalance());
    }
}
