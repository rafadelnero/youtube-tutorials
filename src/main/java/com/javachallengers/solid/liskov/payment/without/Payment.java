package com.javachallengers.solid.liskov.payment.without;

abstract class Payment {
    abstract void processPayment();
    abstract void processRefund();
}