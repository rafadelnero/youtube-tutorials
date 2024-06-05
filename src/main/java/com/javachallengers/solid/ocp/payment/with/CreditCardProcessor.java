package com.javachallengers.solid.ocp.payment.with;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Logic to process Credit Card payment
    }
}

