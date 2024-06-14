package com.javachallengers.solid.liskov.payment.with;

class GiftCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Process payment with Gift Card");
        // logic for gift card payment
    }
}