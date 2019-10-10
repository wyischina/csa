package com.wyischina;


import java.awt.*;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        int radius = 20;
        double numberOfTriangles = 36;
        turtle.speed(1);

        //Draw ten concentric circles
        for (int i = 0; i <= 9; i++) {
            makeCircle(turtle, radius, numberOfTriangles);
            radius = radius + 10;
        }
    }

    private static void makeCircle(Turtle turtle, int radius, double numberOfTriangles) {
        //Move the turtle to the bottom of the circle
        turtle.up();
        turtle.right(90);
        turtle.forward(radius);
        turtle.left(85);
        turtle.down();

        //Looping to draw 36 sides to make one circle
        for (int i = 0; i <= numberOfTriangles; i++) {
            turtle.left(10);
            turtle.forward(2 * Math.sin(Math.toRadians(5)) * radius);
        }

        //Bring the turtle back to the center
        turtle.up();
        turtle.home();
    }
}
