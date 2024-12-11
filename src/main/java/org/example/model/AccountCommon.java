package org.example.model;

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
