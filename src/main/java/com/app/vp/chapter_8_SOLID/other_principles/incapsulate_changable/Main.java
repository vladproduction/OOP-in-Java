package com.app.vp.chapter_8_SOLID.other_principles.incapsulate_changable;

public class Main {
    public static void main(String[] args) {

        // Create a new BankAccount
        BankAccount myAccount = new BankAccount("123456789");

        // Deposit and withdraw money
        myAccount.deposit(1500);
        myAccount.withdraw(500);

        // Check current balance
        System.out.println("Current Balance: $" + myAccount.getBalance());

        // Attempting to withdraw more than the current balance
        myAccount.withdraw(2000); // Should show invalid withdrawal message


    }


}
