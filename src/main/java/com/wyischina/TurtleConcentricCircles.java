package com.wyischina;
public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        //generate a turtle
        int n = 100;
        double angle = 180 - (90 - 360 / (double) (2 * n));
        int NumCircle = 10;
        turtle.speed(5);
        /*
        input the number of sides of the polygon, the angle for each turn, and the number of circles
        turtle.speed controls the speed of the turtle (higher delay = lower speed)
        */

        //using a for loop to draw the intended number of circles
        for (int i = 0; i < NumCircle; i++) {
            double radius = 20 + (20 * i);
            //set the radius of the circle
            turtle.up();
            turtle.home();
            turtle.forward(radius);
            turtle.left(angle);
            turtle.down();
            drawCircle(turtle, n, radius);
            turtle.up();
            turtle.home();
        }
    }

    //The following method command the turtle to draw a polygon with n side
    private static void drawCircle(Turtle turtle,int n, double radius) {
        double angle = 180 - (n - 2) * 180 / (double) n;
        //calculating the angle the turtle must turn each time
        double length = 2 * Math.sin(Math.PI / (n)) * radius;
        //calculating the length the turtle must move each time
        for (int i = 0; i < n; i++) {
            turtle.forward(length);
            turtle.left(angle);
            //using a for loop to repeat the process of turning and drawing, completing the drawing of circle
        }
    }
}

