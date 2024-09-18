package com.app.vp.chapter_8_SOLID.other_principles.do_not_repead;

// SavingsAccount class inheriting from BankAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    protected void printDepositMessage(double amount) {
        System.out.println("Savings Account Deposited: $" + amount);
    }

    @Override
    protected void printWithdrawalMessage(double amount) {
        System.out.println("Savings Account Withdrew: $" + amount);
    }

    @Override
    protected void printInvalidDepositMessage() {
        System.out.println("Invalid deposit amount for Savings Account.");
    }

    @Override
    protected void printInvalidWithdrawalMessage() {
        System.out.println("Invalid withdrawal amount for Savings Account.");
    }
}
