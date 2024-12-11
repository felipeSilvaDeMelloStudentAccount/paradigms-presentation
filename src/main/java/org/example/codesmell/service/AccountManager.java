package org.example.codesmell.service;

import org.example.codesmell.model.CreditAccount;
import org.example.codesmell.model.CurrentAccount;
import org.example.codesmell.model.LoanAccount;
import org.example.codesmell.model.MortgageAccount;

public class AccountManager {

    public Object createAccount(String accountType, double initialBalance){
        return switch (accountType) {
            case "BankAccount" -> new CurrentAccount(initialBalance);
            case "LoanAccount" -> new LoanAccount(initialBalance);
            case "CreditAccount" -> new CreditAccount(initialBalance);
            case "MortgageAccount" -> new MortgageAccount(initialBalance);
            default -> throw new IllegalArgumentException("Account type '" + accountType + "' not found");
        };
    }
}
