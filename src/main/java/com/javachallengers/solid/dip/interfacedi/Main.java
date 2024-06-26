package com.javachallengers.solid.dip.interfacedi;

public class Main {
    public static void main(String[] args) {
        PrintableClient client = new PrintableClient();
        ServiceInjector injector = new ConsolePrinterServiceInjector();
        
        injector.inject(client);

        client.printMessage("Hello, Interface Injection!");
    }
}