package com.app.vp.chapter_8_SOLID.other_principles.developing_by_interfaces;

public class PaymentProcessor {

    public void process(Payment payment, double amount){
        payment.processPayment(amount);
        System.out.println(payment.getPaymentDetails());
    }

}
