package com.javachallengers.solid.srp.with;

import java.util.List;

public class Order {
    private List<Item> items;
    private double total;

    public Order(List<Item> items) {
        this.items = items;
        this.total = 0.0;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}