package com.javachallengers.interface_vs_abstract.interfaceex.abstractex;

class Car extends Vehicle {
    private double fuelLevel;

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
    public double getFuelLevel() {
        return this.fuelLevel;
    }
}