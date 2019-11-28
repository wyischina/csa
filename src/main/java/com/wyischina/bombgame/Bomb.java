package com.wyischina.bombgame;

public class Bomb extends Spaces{

    public Bomb(int xData, int yData, boolean isActivated, String x){
        xCoordinate = xData;
        yCoordinate = yData;
        this.activated = isActivated;
        type = x;
    }
    public void changeType(){
        type = "O~ ";
    }

    public boolean isActivated(){return activated;}


}
