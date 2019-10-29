package com.wyischina.oop;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public void Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.sqrt(this.radius) * Math.PI;
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}
