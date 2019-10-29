package com.wyischina.circle;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
       this.x = 0;
       this.y = 0;
    }
    public MyPoint(int x, int y){
      this.x=x;
      this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        return new int[]{this.x,this.y};
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
    public double distance(MyPoint a){
        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
    }
    public double distance(){
        return distance(0,0);
    }
}
