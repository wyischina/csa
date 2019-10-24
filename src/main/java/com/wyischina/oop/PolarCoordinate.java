package com.wyischina.oop;

public class PolarCoordinate {
    private double radius;
    private double theda;

    public PolarCoordinate(){
        this(0,0);
    }

    public PolarCoordinate(double radius, double theda){
        this.radius = radius;
        this.theda = theda;
    }
}
