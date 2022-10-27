package com.company;

public class Circle {

    private double radius;
    private String color;
    final public double p = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return p * radius * radius;
    }

    public String toString() {
        return this.color;
    }

}
