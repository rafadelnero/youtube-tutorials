package com.javachallengers.solid.dip.interfacedi;

// Implementation of Service Injector
public class ConsolePrinterServiceInjector implements ServiceInjector {
    @Override
    public void inject(PrintableClient client) {
        client.setPrinterService(new ConsolePrinterService());
    }
}