package com.wyischina.oop;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x + x), 2)  + Math.pow((this.y + y), 2));
    }
}
