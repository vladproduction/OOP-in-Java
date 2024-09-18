package com.app.vp.chapter_8_SOLID.other_principles.developing_by_interfaces;

public class CreditCardPayment implements Payment{

    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Implementation details for credit card processing would go here
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card Payment: " + cardHolderName + " (Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4) + ")";
    }
}
