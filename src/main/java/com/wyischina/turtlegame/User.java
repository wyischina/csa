package com.wyischina.turtlegame;

import com.wyischina.Turtle;

public class User {
    Turtle turtle;

    public User(){
       Turtle turtle = new Turtle();
       this.turtle = turtle;
       turtle.up();
    }

}
