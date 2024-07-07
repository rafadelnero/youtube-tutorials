package com.javachallengers.interface_vs_abstract.interfaceex.functional;

public class Main {
    public static void main(String[] args) {
        // Using lambda expression to create an instance of Square
        Square square = (int x) -> x * x;

        // Using the instance
        int result = square.compute(5);
        System.out.println("Square of 5 is: " + result);
    }
}