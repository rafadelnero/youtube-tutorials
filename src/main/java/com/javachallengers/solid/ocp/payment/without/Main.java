package com.javachallengers.solid.ocp.payment.without;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService("creditCard");
        checkout.checkout(200.00);  // Pay $200 using credit card

        checkout = new CheckoutService("paypal");
        checkout.checkout(150.00);  // Pay $150 using PayPal
    }
}