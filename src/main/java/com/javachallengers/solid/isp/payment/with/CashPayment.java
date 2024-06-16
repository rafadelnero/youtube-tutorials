package com.javachallengers.solid.isp.payment.with;

class CashPayment implements Payable, Refundable {
    public void pay() {
        System.out.println("Processing cash payment");
    }

    public void refund() {
        System.out.println("Processing cash refund");
    }
}