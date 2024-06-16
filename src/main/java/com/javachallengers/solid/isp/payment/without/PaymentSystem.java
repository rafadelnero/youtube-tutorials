package com.javachallengers.solid.isp.payment.without;

public class PaymentSystem {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment cash = new CashPayment();

        creditCard.pay();
        creditCard.refund();
        creditCard.validateCard();
        creditCard.processOnlineTransaction();

        cash.pay();
        cash.refund();
        // These methods do nothing meaningful
        cash.validateCard();
        cash.processOnlineTransaction();
    }
}