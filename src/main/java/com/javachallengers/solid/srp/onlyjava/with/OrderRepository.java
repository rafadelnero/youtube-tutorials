package com.javachallengers.solid.srp.onlyjava.with;

public class OrderRepository {
    public void saveOrder(Order order) {
        // Database saving logic
        System.out.println("Order saved with total: " + order.getTotal());
    }
}
