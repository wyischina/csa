package com.wyischina.oop;

public class Circle {
    double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public double getCircumstance () {
        return radius * 2 * Math.PI;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }


}
