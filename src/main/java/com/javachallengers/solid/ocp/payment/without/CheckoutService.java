package com.javachallengers.solid.ocp.payment.without;

public class CheckoutService {
    private PaymentProcessor paymentProcessor;

    public CheckoutService(String paymentMethod) {
        this.paymentProcessor = new PaymentProcessor(paymentMethod);
    }

    public void checkout(double amount) {
        paymentProcessor.processPayment(amount);
    }
}