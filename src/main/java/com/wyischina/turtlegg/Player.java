package com.wyischina.turtlegg;

import com.wyischina.Turtle;

import java.awt.*;

public class Player extends Turtle {
    int speed;

    public Player(){
        up();
        fillColor(Color.red);
        setPosition(-100, 50);
    }

}
