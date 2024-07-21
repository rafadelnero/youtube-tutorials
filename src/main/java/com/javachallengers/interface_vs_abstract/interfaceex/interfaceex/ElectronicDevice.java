package com.javachallengers.interface_vs_abstract.interfaceex.interfaceex;

interface ElectronicDevice extends ElectronicDevice2, ElectronicDevice3 {

    public static final String DEVICE_CATEGORY = "General Electronics";

    void turnOn();
    void turnOff();
    int returnsInt();

    // It can be overriden and it's public
    default void reset() {
        System.out.println("Device is resetting");
        logAction("Logging... Reset");
    }

    static void displayCategory() {
        System.out.println("Device Category: " + DEVICE_CATEGORY);
    }

    // Can only be used within this interface
    private void logAction(String action) {
        System.out.println("Action Logged: " + action);
    }
}
