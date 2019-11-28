package com.wyischina.turtlegg;

import com.wyischina.Turtle;

import java.util.Random;

public class Bomb extends Turtle{
    int speed;

    public Bomb(){
        up();
        Random random = new Random();
        setPosition(random.nextInt(100),random.nextInt(100));

    }

}
