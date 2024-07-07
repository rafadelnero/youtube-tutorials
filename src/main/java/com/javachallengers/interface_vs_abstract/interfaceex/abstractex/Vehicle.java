package com.javachallengers.interface_vs_abstract.interfaceex.abstractex;

abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();
    public abstract void stop();

    public void displayBrand() {
        System.out.println("Brand: " + this.brand);
    }

    public abstract double getFuelLevel();

    // Template method
    public final void operateVehicle() {
        start();
        System.out.println("Vehicle is in operation");
        stop();
    }
}
