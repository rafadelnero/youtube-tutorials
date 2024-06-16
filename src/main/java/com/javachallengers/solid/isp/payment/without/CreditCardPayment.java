package com.javachallengers.solid.isp.payment.without;

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Processing credit card payment");
    }

    public void refund() {
        System.out.println("Processing credit card refund");
    }

    public void validateCard() {
        System.out.println("Validating credit card");
    }

    public void processOnlineTransaction() {
        System.out.println("Processing online transaction for credit card");
    }
}