package com.wyischina.circle;

public class Circle {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "Circle[radius="+radius+"]";
    }
}
