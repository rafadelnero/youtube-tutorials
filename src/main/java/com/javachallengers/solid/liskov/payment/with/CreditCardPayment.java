package com.javachallengers.solid.liskov.payment.with;

class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Process payment with Credit Card");
        // logic for credit card payment
    }
}