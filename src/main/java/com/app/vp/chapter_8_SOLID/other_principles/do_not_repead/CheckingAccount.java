package com.app.vp.chapter_8_SOLID.other_principles.do_not_repead;

// CheckingAccount class inheriting from BankAccount
class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    protected void printDepositMessage(double amount) {
        System.out.println("Checking Account Deposited: $" + amount);
    }

    @Override
    protected void printWithdrawalMessage(double amount) {
        System.out.println("Checking Account Withdrew: $" + amount);
    }

    @Override
    protected void printInvalidDepositMessage() {
        System.out.println("Invalid deposit amount for Checking Account.");
    }

    @Override
    protected void printInvalidWithdrawalMessage() {
        System.out.println("Invalid withdrawal amount for Checking Account.");
    }
}
