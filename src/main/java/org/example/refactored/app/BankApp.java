package org.example.refactored.app;

import org.example.refactored.model.*;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("Hello class mates\n");
        Account bankAccount = new CurrentAccount(1000.0);
        Account loanAccount = new LoanAccount(-30000.0);
        Account creditAccount = new CreditAccount(9000.0);
        Account mortgageAccount = new MortgageAccount(700000.0);
        System.out.println("Bank Account Balance: " + bankAccount.getBalance());
        System.out.println("Loan Account Balance: " + loanAccount.getBalance());
        System.out.println("Credit Account Balance: " + creditAccount.getBalance());
        System.out.println("Mortgage Account Balance: " + mortgageAccount.getBalance());
    }
}