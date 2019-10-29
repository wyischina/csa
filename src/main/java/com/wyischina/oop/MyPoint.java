package com.wyischina.oop;

    public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this(0,0);
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{this.x,this.y};
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y ,2));
    }

    public double distance(MyPoint another){
        return distance(another.x, another.y);
    }

    public double distance(){
        return distance(0,0);
    }
}
