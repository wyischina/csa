package com.wyischina.bank;

public class BankAccountExercise {
    public static void main(String[] args){
        Customer John = new Customer("John Smith");
        Account saving = new Account();
        Account current = new Account();

        John.setSavingAccount(saving);
        John.setCurrentAccount(current);

        Transaction t1 = new Transaction(10000, false);
        saving.addTransaction(t1);

        Transaction t2 = new Transaction(5000, true);
        saving.addTransaction(t2);

        Transaction t3 = new Transaction(8000, false);
        current.addTransaction(t3);

        System.out.println(John.getTotalBalance());
    }
}
