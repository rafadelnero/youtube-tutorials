package com.javachallengers.solid.liskov.employee.with;

class PartTimeEmployee extends Employee {
    @Override
    void calculatePayment() {
        System.out.println("Calculate payment for PartTimeEmployee");
        // logic for part time employee payment
    }
}