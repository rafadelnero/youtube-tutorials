package com.javachallengers.solid.liskov.payment.with;

public class PaymentTest {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();

        Payment giftCardPayment = new GiftCardPayment();
        giftCardPayment.processPayment();
    }
}