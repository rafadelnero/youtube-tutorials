package com.javachallengers.interface_vs_abstract.interfaceex;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice myPhone = new Smartphone();
        myPhone.turnOn();
        myPhone.turnOff();
        myPhone.reset();
        ElectronicDevice.displayCategory();
    }
}