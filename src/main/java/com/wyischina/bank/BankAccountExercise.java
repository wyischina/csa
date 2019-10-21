package com.wyischina.bank;

public class BankAccountExercise {

    public static void main(String[] args) {
        // 1. create a new Customer with name "John Smith";
        Customer customer1 = new Customer();
        customer1.name = "John Smith";

        // 2. add a saving and current account to the newly created customer;
        Account saving = new Account();
        Account current = new Account();
        customer1.setCurrentAccount(current);
        customer1.setSavingAccount(saving);

        // 3. add a $10000 credit transaction to the saving account;
        Transaction t1 = new Transaction();
        t1.amount = 10000;
        t1.isDebit = false;
        saving.addTransaction(t1);

        // 4. add a $5000 debit transaction to the saving account;
        Transaction t2 = new Transaction();
        t2.amount = 5000;
        t2.isDebit = true;
        saving.addTransaction(t2);

        // 5. add a $8000 credit transaction to the current account;
        Transaction t3 = new Transaction();
        t3.amount = 8000;
        t3.isDebit = false;
        current.addTransaction(t3);

        System.out.println("total balance is " + customer1.getTotalBalance());
    }

}
