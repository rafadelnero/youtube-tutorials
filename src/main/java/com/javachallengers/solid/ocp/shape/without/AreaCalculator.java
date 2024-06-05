package com.javachallengers.solid.ocp.shape.without;// Using the class
import java.util.List;

public class AreaCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}