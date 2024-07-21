package com.javachallengers.interface_vs_abstract.interfaceex.interfaceex;

import com.javachallengers.interface_vs_abstract.interfaceex.interfaceex.ElectronicDevice;
import com.javachallengers.interface_vs_abstract.interfaceex.interfaceex.Smartphone;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice myPhone = new Smartphone();
        myPhone.turnOn();
        myPhone.turnOff();
        myPhone.reset();
        ElectronicDevice.displayCategory();
    }
}