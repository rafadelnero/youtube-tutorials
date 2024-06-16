package com.javachallengers.solid.isp.payment.without;

class CashPayment implements Payment {
    public void pay() {
        System.out.println("Processing cash payment");
    }

    public void refund() {
        System.out.println("Processing cash refund");
    }

    public void validateCard() {
        // Not applicable
    }

    public void processOnlineTransaction() {
        // Not applicable
    }
}