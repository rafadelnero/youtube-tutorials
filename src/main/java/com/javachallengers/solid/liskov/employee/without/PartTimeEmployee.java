package com.javachallengers.solid.liskov.employee.without;

class PartTimeEmployee extends Employee {
    @Override
    void calculatePayment() {
        System.out.println("Calculate payment for PartTimeEmployee");
        // logic for part time employee payment
    }

    @Override
    void calculateBonus() {

        throw new UnsupportedOperationException("Part time employee doesn't receive a bonus");
    }
}
