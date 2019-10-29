package com.wyischina.bank;

public class SavingAccount extends Account {

    public void addTransaction(Transaction t) {
        if (t.isDebit) {
            // debit transaction, therefore give away interest
            float interestRate = 0.1f;
            int interest = Math.round(t.amount * interestRate);
            super.addTransaction(t);

            Transaction interestTransaction = new Transaction();
            interestTransaction.isDebit = true;
            interestTransaction.amount = interest;
            super.addTransaction(interestTransaction);
        } else {
            // credit transaction, no interest
            super.addTransaction(t);
        }
    }

}
