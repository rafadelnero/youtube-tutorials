package com.javachallengers.solid.srp.with;

public class OrderService {
    private OrderCalculator calculator;
    private OrderRepository repository;

    public OrderService(OrderCalculator calculator, OrderRepository repository) {
        this.calculator = calculator;
        this.repository = repository;
    }

    public void processOrder(Order order) {
        double total = calculator.calculateTotal(order);
        order.setTotal(total);
        repository.saveOrder(order);
    }
}