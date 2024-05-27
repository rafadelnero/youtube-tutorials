package com.javachallengers.solid.srp.onlyjava.with;

public class OrderCalculator {
    public double calculateTotal(Order order) {
        double total = 0.0;
        for (Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}