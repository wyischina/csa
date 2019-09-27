package com.wyischina;


import java.awt.*;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        // todo: draw concentric circles
        int n = 30;
        double initialAngle = 180 - (90 - 360/(double)(2*n));
        int circlesNum = 10;

        for (int i = 0; i < circlesNum; i++){
            double radius = 10 + (10*i);
            turtle.up();
            turtle.home();
            turtle.forward(radius);
            turtle.left(initialAngle);
            turtle.down();

            drawCircle(turtle, n, radius);
        }
        turtle.up();
        turtle.home();



    }

    public static void drawCircle(Turtle turtle, int n, double radius) {
        /**
         *  draw a circle in the middle of the screen
         */
        double length = 2 * Math.sin(Math.PI/(n)) * radius;
        double angle = 180 - (n-2) * 180 / n;
        for(int i = 0; i < n; i++){
            turtle.forward(length);
            turtle.left(angle);
        }
    }
}
