package com.javachallengers.solid.dip.interfacedi;

public class Main {
    public static void main(String[] args) {
        // Create a client instance
        PrintableClient client = new PrintableClient();
        
        // Create a service injector instance
        ServiceInjector injector = new ConsolePrinterServiceInjector();
        
        // Inject the dependency
        injector.inject(client);

        // Use the client to print a message
        client.printMessage("Hello, Interface Injection!");
    }
}