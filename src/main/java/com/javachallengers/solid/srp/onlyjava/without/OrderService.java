package com.javachallengers.solid.srp.onlyjava.without;

public class OrderService {
    public void processOrder(Order order) {
        order.calculateTotal();
        saveOrder(order);
    }

    public void saveOrder(Order order) {
        // Database saving logic
        System.out.println("Order saved with total: " + order.getTotal());
    }
}