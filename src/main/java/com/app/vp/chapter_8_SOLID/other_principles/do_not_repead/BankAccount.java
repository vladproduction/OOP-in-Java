package com.app.vp.chapter_8_SOLID.other_principles.do_not_repead;

// Base class for all bank accounts
abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            printDepositMessage(amount);
        } else {
            printInvalidDepositMessage();
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            printWithdrawalMessage(amount);
        } else {
            printInvalidWithdrawalMessage();
        }
    }

    public double getBalance() {
        return balance;
    }

    // Abstract methods for specific messages
    protected abstract void printDepositMessage(double amount);

    protected abstract void printWithdrawalMessage(double amount);

    protected abstract void printInvalidDepositMessage();

    protected abstract void printInvalidWithdrawalMessage();
}
