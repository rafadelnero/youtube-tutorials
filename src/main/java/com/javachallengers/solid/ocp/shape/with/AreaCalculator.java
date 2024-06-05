package com.javachallengers.solid.ocp.shape.with;// Using the classes
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