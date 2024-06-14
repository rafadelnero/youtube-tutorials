package com.javachallengers.solid.liskov.employee.without;

class FullTimeEmployee extends Employee {
    @Override
    void calculatePayment() {
        System.out.println("Calculate payment for FullTimeEmployee");
        // logic for full time employee payment
    }

    @Override
    void calculateBonus() {
        System.out.println("Calculate bonus for FullTimeEmployee");
        // logic for full time employee bonus
    }
}