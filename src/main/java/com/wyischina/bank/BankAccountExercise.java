package com.wyischina.bank;

public class BankAccountExercise {

    public void main(String[] arg) {
        Customer customer = new Customer();
        customer.name = "John Smith";

        Account saving = new Account();
        Account current = new Account();
        customer.setCurrentAccount(current);
        customer.setSavingAccount(saving);

        Transaction t1 = new Transaction();
        t1.amount = 10000;
        t1.isDebit = false;
        saving.addTransaction(t1);

        Transaction t2 = new Transaction();
        t2.amount = 5000;
        t2.isDebit = true;
        saving.addTransaction(t2);


        Transaction t3 = new Transaction();
        t3.amount = 8000;
        t3.isDebit = false;
        current.addTransaction(t3);

        System.out.println("The total value in your balance is " + customer.getTotalBalance());
    }
}
