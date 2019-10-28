package com.wyischina.bank;

public class BankAccountExcerise {

    public static void main(String args[]){

        Account currentAccount = new Account();
        Account savingAccount = new Account();
        Customer customer=  new Customer("John Smith"); //create a new Customer with name "John Smith"
        Transaction transaction = new Transaction();

        //add a saving and current account to the newly created customer
        customer.setCurrentAccount(currentAccount);
        customer.setSavingsAccount(savingAccount);

        //add a $10000 credit transaction to the saving account
        System.out.println("Balance before " + "$"+customer.getTotalBalance());
        transaction.isDebit = false;
        transaction.amount = 10000;
        savingAccount.addTransaction(transaction);

        //add a $5000 debit transaction to the saving account
        transaction.isDebit = true;
        transaction.amount = 5000;
        savingAccount.addTransaction(transaction);

        //add a $8000 credit transaction to the current account
        transaction.isDebit = false;
        transaction.amount = 8000;
        currentAccount.addTransaction(transaction);

        //print out the total balance of the customer after the transactions have been applied
        System.out.println("Balance after: " + "$"+customer.getTotalBalance());
    }
}
