package com.wyischina;


import java.awt.*;
import java.util.Scanner;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
         int r = 10;
        //r = radius
        double arc = (r * Math.PI) / 2;
        //arc = arc length of 90 degrees
        double side = arc / 90;
        //y = number of sides in a 90 degree arc
        turtle.up();
        turtle.forward(r);
        turtle.left(90);
        turtle.down();
        //in order to make the starting point the center
        turtle.speed(1);
        //speeding up the turtle
        for (int t = 0; t < 10; t++) {
            //for loop ends after creating 10 circles
            for (int i = 0; i <= 360; i++) {
                //for loop ends after moving around 360 times
                turtle.forward(side);
                turtle.left(1);
            }
            circle(turtle);
            //moves right 10 distance away from the original circle
            r = r + 10;
            side = ((r * Math.PI) / 2) / 90;
            //radius is updated -> circumference is also updated
        }
        turtle.up();
        turtle.home();
        //turtle returns to center
    }

    private static void circle(Turtle turtle){
        //method for moving 10 away from the original circle
        turtle.up();
        turtle.right(90);
        turtle.forward(10);
        turtle.left(90);
        turtle.down();
    }
}
