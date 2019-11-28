package com.wyischina.bombgame;

public class Player extends Spaces{

    public Player(){
        xCoordinate = 0;
        yCoordinate = 2;
        type = "$$ ";
        activated = false;
    }
    public Player(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
        type = "$$ ";
        activated = false;
    }

    public void setPoint(Arena arena, int x, int y){
        xCoordinate = x;
        yCoordinate = y;
        arena.changeArena(x, y, "Player");
    }
}
