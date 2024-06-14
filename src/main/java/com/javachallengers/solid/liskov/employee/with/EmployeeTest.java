package com.javachallengers.solid.liskov.employee.with;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.calculatePayment();

        Employee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.calculatePayment();
    }
}