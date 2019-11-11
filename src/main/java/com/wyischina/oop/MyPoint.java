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

    public int getX(){ return x; }
    public void setX(int x){ this.x = x; }
    public int getY(){ return y; }
    public void setY(int y){ this.y = y; }

    public int[] getXY(){return new int[]{this.x,this.y};}


}
