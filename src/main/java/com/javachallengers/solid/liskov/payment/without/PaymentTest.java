package com.javachallengers.solid.liskov.payment.without;

public class PaymentTest {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processRefund();

        Payment giftCardPayment = new GiftCardPayment();
        giftCardPayment.processRefund(); // will throw an exception
    }
}