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
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference(){
        return Math.PI * this.radius * 2;
    }

    public String toString(){
        return "Circle[radius=" + this.radius + "]";
    }
}
