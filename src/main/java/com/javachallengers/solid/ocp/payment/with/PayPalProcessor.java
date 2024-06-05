package com.javachallengers.solid.ocp.payment.with;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Logic to process PayPal payment
    }
}