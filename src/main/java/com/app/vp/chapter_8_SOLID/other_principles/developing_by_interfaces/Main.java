package com.app.vp.chapter_8_SOLID.other_principles.developing_by_interfaces;

public class Main {
    public static void main(String[] args) {
        // Create instances of payment methods
        Payment creditCardPayment = new CreditCardPayment("1234567812345678", "John Doe");
        Payment payPalPayment = new PayPalPayment("john.doe@example.com");

        // Create a payment processor
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Process payments using the Payment interface
        paymentProcessor.process(creditCardPayment, 100.00);
        paymentProcessor.process(payPalPayment, 200.00);
    }
}
