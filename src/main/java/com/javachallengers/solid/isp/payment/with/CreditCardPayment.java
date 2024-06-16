package com.javachallengers.solid.isp.payment.with;

class CreditCardPayment implements Payable, Refundable, CardValidatable, OnlineTransactionProcessable {
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