package com.javachallengers.solid.liskov.rectangle.with;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}