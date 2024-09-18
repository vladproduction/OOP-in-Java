package com.app.vp.chapter_8_SOLID.other_principles.incapsulate_changable;

public class BankAccount {

    // Private fields to encapsulate the internal state
    private String accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance set to zero
    }

    // Public method to deposit money, ensuring proper control
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Update the balance
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money, checking that balance is sufficient
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Update the balance
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Public method to get the current balance without exposing the field directly
    public double getBalance() {
        return balance; // Return the current balance
    }

    // Protected method example (could be used for subclassing)
    protected String getAccountNumber() {
        return accountNumber; // Protects access to the account number within the class hierarchy
    }

}

