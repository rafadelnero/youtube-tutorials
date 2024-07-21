package com.javachallengers.interface_vs_abstract.interfaceex.abstractex;

class Car extends Vehicle {
    private double fuelLevel;
    // A doSomething
    // B and C class override the doSomething differently
    // D extends B, C = What method will be the right one? B or C?
    public Car(String brand, double fuelLevel) {
        super(brand);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void displayBrand() {
        System.out.println("Diplay brand of subclass Car");
    }

    @Override
    public double getFuelLevel() {
        return this.fuelLevel;
    }
}