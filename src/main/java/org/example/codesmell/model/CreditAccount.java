package org.example.codesmell.model;

import org.example.refactored.model.Account;
import org.example.refactored.model.AccountCommon;

public class CreditAccount extends AccountCommon implements Account {
    public CreditAccount(double balance) {
        super(balance);
    }
}