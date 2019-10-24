package com.wyischina.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    @Test

    void testAccountCreation() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
    }
}
