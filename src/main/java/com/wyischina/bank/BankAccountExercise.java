package com.wyischina.bank;


public class BankAccountExercise {

    public static void main(String[]args){
        Customer customer = new Customer();
        customer.name = "John Smith";

        Account saving = new Account();
        Account current = new Account();
        customer.setCurrentAccount(current);
        customer.setSavingsAccount(saving);

        Transaction t1 = new Transaction();
        t1.amount = 10000;
        t1.isDebit = false;
        saving.addTransaction(t1);
        System.out.println("Saving balance after first transaction: " + saving.getBalance());

        Transaction t2 = new Transaction();
        t2.amount = 5000;
        t2.isDebit = true;
        saving.addTransaction(t2);
        System.out.println("Saving balance after second transaction: " + saving.getBalance());


        Transaction t3 = new Transaction();
        t3.amount = 8000;
        t3.isDebit = false;
        current.addTransaction(t3);
        System.out.println("Current balance after third transaction: " + current.getBalance());

        System.out.println("Your total balance is: " + customer.getTotalBalance());
    }

}
