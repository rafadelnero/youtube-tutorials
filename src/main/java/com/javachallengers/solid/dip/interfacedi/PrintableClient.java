package com.javachallengers.solid.dip.interfacedi;

// Client class that depends on PrinterService
public class PrintableClient {
    private PrinterService printerService;

    public void setPrinterService(PrinterService printerService) {
        this.printerService = printerService;
    }

    public void printMessage(String message) {
        if (printerService != null) {
            printerService.print(message);
        } else {
            System.out.println("PrinterService not set.");
        }
    }
}