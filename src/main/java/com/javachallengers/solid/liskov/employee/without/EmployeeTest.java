package com.javachallengers.solid.liskov.employee.without;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.calculateBonus();

        Employee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.calculateBonus(); // will throw an exception
    }
}