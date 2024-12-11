package org.example.codesmell.model;

import org.example.refactored.model.Account;
import org.example.refactored.model.AccountCommon;

public class LoanAccount extends AccountCommon implements Account {
    public LoanAccount(double balance) {
        super(balance);
    }
}
