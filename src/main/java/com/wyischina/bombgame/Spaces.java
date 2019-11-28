package com.wyischina.bombgame;

public class Spaces {
    int xCoordinate;
    int yCoordinate;
    boolean activated;
    String type;

    public void changeType(){}
    public boolean isActivated(){
        return activated;
    }
    public void setActivated(boolean x){
        activated =x;
    }

    public String toString(){ return type;}
    public int getxCoordinate(){return xCoordinate;}
    public int getyCoordinate(){return yCoordinate;}
}
