package com.javachallengers.interface_vs_abstract.interfaceex.interfaceex;

class Smartphone implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is turning off");
    }

    @Override
    public int returnsInt() {
        return 0;
    }

    @Override
    public void reset() {
        System.out.println("Overriding default reset method...");
    }
}
