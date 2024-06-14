package com.javachallengers.solid.liskov.payment.without;

class GiftCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Process payment with Gift Card");
        // logic for gift card payment
    }

    @Override
    void processRefund() {
        throw new UnsupportedOperationException("Gift cards cannot be refunded");
    }
}