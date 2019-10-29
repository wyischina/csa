package com.wyischina.oop;

public class Circle {
    private double radius;

    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double Area = Math.PI * (Math.pow(radius, 2));
        return Area;
    }

    public double getCircumference(){
        double Circumference = Math.PI * radius;
        return Circumference;
    }

    public String toString(){
        return "Circle [r=" + radius + "]";
    }
}

