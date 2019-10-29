package com.wyischina.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    void testAccountCreation() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
    }

    @Test
    void testAddDebitTransaction() {
        Account account = new Account();
        Transaction t = new Transaction();
        t.isDebit = true;
        t.amount = 1000;

        assertEquals(0, account.getBalance());
        account.addTransaction(t);
        assertEquals(1000, account.getBalance());
    }

}
