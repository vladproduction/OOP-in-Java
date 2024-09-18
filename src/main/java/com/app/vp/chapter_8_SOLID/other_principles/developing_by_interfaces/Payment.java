package com.app.vp.chapter_8_SOLID.other_principles.developing_by_interfaces;

public interface Payment {

    void processPayment(double amount);
    String getPaymentDetails();

}
