package com.wyischina.bankAccountExercise;

public class BankAccountExercise {
    public static void main(String[] args){
        Customer c1 = new Customer();
        Account savingAccount = new Account();
        Account currentAccount = new Account();
        Transaction trans0 = new Transaction(10000, false);
        Transaction trans1 = new Transaction(5000,true);
        Transaction trans2 = new Transaction(8000,false);

        c1.name = "John Smith";
        c1.setCurrentAccount(currentAccount);
        c1.setSavingAccount(savingAccount);

        savingAccount.addTransaction(trans0);
        savingAccount.addTransaction(trans1);
        currentAccount.addTransaction(trans2);

        System.out.println("Your total balance is: " + c1.getTotalBalance());
    }
}
