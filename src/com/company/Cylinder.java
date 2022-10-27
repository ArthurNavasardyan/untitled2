package com.company;

public class Cylinder extends Circle {

    private double height;


    public Cylinder() {
        super();
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * super.p * super.getRadius() * height;
    }

}