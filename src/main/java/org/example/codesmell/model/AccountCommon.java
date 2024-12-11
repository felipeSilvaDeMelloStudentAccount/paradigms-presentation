package org.example.codesmell.model;

import org.example.refactored.model.Account;

public abstract class AccountCommon implements Account {
    private final double balance;

    public AccountCommon(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;

    }
}
