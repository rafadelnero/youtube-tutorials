package com.javachallengers.interface_vs_abstract.interfaceex.interfaceex.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Square square = (int x) -> x * x;

        int result = square.compute(5);
        System.out.println("Square of 5 is: " + result);

        // Examples: Supplier, Predicate, Function, Consumer
    }
}