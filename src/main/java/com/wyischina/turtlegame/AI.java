package com.wyischina.turtlegame;

import com.wyischina.Turtle;

public class AI {
    Turtle turtle;
    public AI(int level){
        Turtle turtle = new Turtle();
        this.turtle =turtle;
        turtle.up();
        turtle.shapeSize(level*8,level*8);
        turtle.speed(10/level);
    }

}
