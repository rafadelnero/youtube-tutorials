package com.javachallengers.solid.ocp.payment.with;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        CheckoutService checkout = new CheckoutService(creditCardProcessor);
        checkout.checkout(200.00);

        PaymentProcessor payPalProcessor = new PayPalProcessor();
        checkout = new CheckoutService(payPalProcessor);
        checkout.checkout(150.00);

        PaymentProcessor debitProcessor = new DebitProcessor();
        checkout = new CheckoutService(debitProcessor);
        checkout.checkout(100);
    }
}