package com.javachallengers.solid.srp.onlyjava.without;

import java.util.List;

public class Order {
    private List<Item> items;
    private double total;

    public Order(List<Item> items) {
        this.items = items;
        this.total = 0.0;
    }

    public void calculateTotal() {
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
    }

    public double getTotal() {
        return total;
    }
}