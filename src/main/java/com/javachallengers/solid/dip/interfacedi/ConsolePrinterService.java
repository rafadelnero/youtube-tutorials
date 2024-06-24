package com.javachallengers.solid.dip.interfacedi;

// Implementation of Printer Service
public class ConsolePrinterService implements PrinterService {
    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}