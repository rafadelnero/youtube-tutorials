package com.javachallengers.interface_vs_abstract.interfaceex.functional;

@FunctionalInterface
interface Square {
    int compute(int x);

    // Compilation error if uncomment the following code
    //double calculateArea();
}