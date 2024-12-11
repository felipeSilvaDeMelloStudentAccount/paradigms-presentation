package org.example.codesmell.app;

import org.example.codesmell.model.CreditAccount;
import org.example.codesmell.model.CurrentAccount;
import org.example.codesmell.model.LoanAccount;
import org.example.codesmell.model.MortgageAccount;
import org.example.codesmell.service.AccountManager;

public class BankApp {

    public static void main(String[] args) {
        System.out.println("Hello class mates\n");

        //App needs to call account manager to create the accounts
        AccountManager accountManager = new AccountManager();
        //Then it needs to parse
        CurrentAccount currentAccount = (CurrentAccount) accountManager.createAccount("BankAccount", 1000.0);
        LoanAccount loanAccount = (LoanAccount) accountManager.createAccount("LoanAccount", -30000.0);
        CreditAccount creditAccount = (CreditAccount) accountManager.createAccount("CreditAccount", 9000.0);
        MortgageAccount mortgageAccount = (MortgageAccount) accountManager.createAccount("MortgageAccount", 700000.0);

        System.out.println("Bank Account Balance: " + currentAccount.getBalance());
        System.out.println("Loan Account Balance: " + loanAccount.getBalance());
        System.out.println("Credit Account Balance: " + creditAccount.getBalance());
        System.out.println("Mortgage Account Balance: " + mortgageAccount.getBalance());
        // Attempt to access an unknown account type
        try {
            System.out.println("Account Balance Not Found: " + accountManager.createAccount("RandomAccount", 0.0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
