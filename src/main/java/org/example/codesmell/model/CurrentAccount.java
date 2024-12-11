package org.example.codesmell.model;

import org.example.refactored.model.Account;
import org.example.refactored.model.AccountCommon;

public class CurrentAccount extends AccountCommon implements Account {
    public CurrentAccount(double balance) {
        super(balance);
    }
}