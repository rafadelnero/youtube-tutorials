package com.javachallengers.solid.liskov.payment.without;

class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Process payment with Credit Card");
        // logic for credit card payment
    }

    @Override
    void processRefund() {
        System.out.println("Process refund to Credit Card");
        // logic for refunding credit card payment
    }
}