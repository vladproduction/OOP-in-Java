package com.app.vp.chapter_8_SOLID.other_principles.developing_by_interfaces;

public class PayPalPayment implements Payment{

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Implementation details for PayPal processing would go here
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Payment: " + email;
    }
}
