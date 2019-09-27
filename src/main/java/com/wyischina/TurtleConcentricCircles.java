package com.wyischina;


import java.awt.*;

//Credit where credit is due:
//Much of this code is thanks to David... I almost figured it out, but David help me filled the logic gaps...

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        // todo: draw concentric circles
        int n = 40;
        double angle = 180 - (90 - 360/(double)(2*n));
        int circNum = 10;

        //Drawing multiple circles
        for(int i = 0; i < circNum; i++){
            double radius = 10 + (10*i);
            turtle.up();
            turtle.home();
            turtle.forward(radius);
            turtle.left(angle);
            turtle.down();
            Circle(turtle,n,radius);
            turtle.up();
            turtle.home();
        }
    }

    public static void Circle(Turtle turtle, int n, double radius) {
        // todo: implement this method to draw a polygon of n-side.
        //Calculating the length that the turtle must move every time it turns
        double length = 2 * Math.sin(Math.PI/(n)) * radius;
        //Calculating the length that the turtle must turn every time
        double angle = 180 - (n-2) * 180 / n;
        //Drawing the circle by repeating the turning of the angle and the moving of the length
        for(int i = 0; i < n; i++){
            turtle.forward(length);
            turtle.left(angle);
        }
    }
}
