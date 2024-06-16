package com.javachallengers.solid.isp.payment.without;

interface Payment {
    void pay();
    void refund();
    void validateCard();
    void processOnlineTransaction();
}
