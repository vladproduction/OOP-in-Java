package com.app.vp.chapter_8_SOLID.other_principles.do_not_repead;

public class Main {
    public static void main(String[] args) {

        // Create a Savings Account
        BankAccount savings = new SavingsAccount("123456789");
        savings.deposit(500);
        savings.withdraw(200);
        System.out.println("Savings Balance: $" + savings.getBalance());

        // Create a Checking Account
        BankAccount checking = new CheckingAccount("987654321");
        checking.deposit(1000);
        checking.withdraw(1200); // Should show invalid message
        System.out.println("Checking Balance: $" + checking.getBalance());

    }

}