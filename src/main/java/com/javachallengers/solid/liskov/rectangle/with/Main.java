package com.javachallengers.solid.liskov.rectangle.with;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Area of rectangle: " + rectangle.getArea());

        Shape square = new Square(4);
        System.out.println("Area of square: " + square.getArea());
    }
}