package com.javachallengers.interface_vs_abstract.interfaceex.abstractex;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", 50.0);
        myCar.operateVehicle();  // Using the template method
        System.out.println("Fuel level: " + myCar.getFuelLevel());
        myCar.displayBrand();

        // Can't instantiate an abstract class
        // new Vehicle(); // an abstract class can be only used with inheritance
    }
}