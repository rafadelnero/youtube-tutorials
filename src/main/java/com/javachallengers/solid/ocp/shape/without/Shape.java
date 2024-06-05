package com.javachallengers.solid.ocp.shape.without;

public class Shape {
    private double width;
    private double height;
    private double radius;
    private String type; // "rectangle", "circle"

    public Shape(String type, double dimension1, double dimension2) {
        this.type = type;
        if (type.equals("rectangle")) {
            this.width = dimension1;
            this.height = dimension2;
        } else if (type.equals("circle")) {
            this.radius = dimension1;
        }
    }

    public double area() {
        switch (type) {
            case "rectangle":
                return width * height;
            case "circle":
                return Math.PI * radius * radius;
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }
}