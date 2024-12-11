package org.example.codesmell.model;

import org.example.refactored.model.Account;
import org.example.refactored.model.AccountCommon;

public class MortgageAccount extends AccountCommon implements Account {
    public MortgageAccount(double balance) {
        super(balance);
    }
}
