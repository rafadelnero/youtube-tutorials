package com.javachallengers.solid.isp.payment.with;

public class PaymentSystem {
    public static void main(String[] args) {
        Payable creditCardPayment = new CreditCardPayment();
        Refundable creditCardRefund = new CreditCardPayment();
        CardValidatable cardValidator = new CreditCardPayment();
        OnlineTransactionProcessable onlineTransactionProcessor = new CreditCardPayment();

        Payable cashPayment = new CashPayment();
        Refundable cashRefund = new CashPayment();

        creditCardPayment.pay();
        creditCardRefund.refund();
        cardValidator.validateCard();
        onlineTransactionProcessor.processOnlineTransaction();

        cashPayment.pay();
        cashRefund.refund();
        // No need to validate card or process online transaction for cash payment
    }
}