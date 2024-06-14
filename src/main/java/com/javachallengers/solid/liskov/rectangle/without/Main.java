package com.javachallengers.solid.liskov.rectangle.without;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Area of rectangle: " + rectangle.getArea());

        Rectangle square = new Square(4);
        square.setWidth(5);
        System.out.println("Area of square: " + square.getArea());
    }
}