package com.javachallengers.interface_vs_abstract.interfaceex;

class Smartphone implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is turning off");
    }
}
