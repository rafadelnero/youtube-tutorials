package com.javachallengers.solid.ocp.payment.without;

public class PaymentProcessor {
    private String method; // "creditCard", "paypal"

    public PaymentProcessor(String method) {
        this.method = method;
    }

    public void processPayment(double amount) {
        switch (method) {
            case "creditCard":
                System.out.println("Processing credit card payment of $" + amount);
                // Logic to process credit card payment
                break;
            case "paypal":
                System.out.println("Processing PayPal payment of $" + amount);
                // Logic to process PayPal payment
                break;
            default:
                throw new IllegalArgumentException("Unsupported payment method");
        }
    }
}