package com.wyischina.oop;

public class Circle {
    double radius;

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
        return 2*Math.PI * this.radius;
    }
    public String toString(){
        return "Circle[radius = "+ this.radius +"]";
    }
}
