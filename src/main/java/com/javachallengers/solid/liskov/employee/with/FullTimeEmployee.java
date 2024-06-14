package com.javachallengers.solid.liskov.employee.with;

class FullTimeEmployee extends Employee {
    @Override
    void calculatePayment() {
        System.out.println("Calculate payment for FullTimeEmployee");
        // logic for full time employee payment
    }
}
