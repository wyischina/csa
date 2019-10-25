package com.wyischina.oop;

public class PolarCoordinate {
    private double radius;
    private double theda;

    public PolarCoordinate(double radius, double theda){
        this.radius = radius;
        this.theda = theda;
    }

    public boolean equals(Object obj){
        PolarCoordinate another = (PolarCoordinate) obj;
//        return this.radius == another.radius && this.theda == another.theda;
        return Math.abs(this.radius - another.radius) < 0.00001 && Math.abs(this.theda - another.theda) < 0.1;
    }
}
