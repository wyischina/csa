package com.wyischina;

import java.util.Scanner;

public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        double n = 40; // this is the number of sides
        drawNgon(turtle, n, 10);
    }

    public static void drawNgon(Turtle turtle, double n, double length) {
        turtle.speed(1);

        double angle = 180.0 - (((n - 2) * 180.0d) / n); // this is the basic calculation of an angle depending on the number of sides
        double radius = (length * 360d) / (2 * angle * Math.PI); // this is how you calculate a radius of a circle

        turtle.speed(10);
        for (int count = 0; count < 10; count++) { //This for loop makes you to draw the concentric circle as much as the value of the integer, count
            turtle.up();
            turtle.right(90);
            turtle.forward(radius);
            turtle.right(90);
            turtle.forward(10);
            turtle.down();
            turtle.left(180);
            // these codes make the tirtle move as much as the radius to start off

            for (int drawCircle = 0; drawCircle < n; drawCircle++) { //this code draws an n-gon shape, depending on the angle and length, and repeats as much as the number of side, n
                turtle.forward(length);
                turtle.left(angle);
            }

            n = n + 2; // it increases the value of side, which makes the circle bigger
            angle = 180.0d - (((n - 2) * 180.0d) / n);
            turtle.up();
            turtle.forward(10);
            turtle.left(90);
            turtle.forward(radius);
            turtle.down();
            turtle.right(90);

            //these codes make the turtle come back to the middle

            length++; // this increases the length, which makes the circle bigger

            radius = (length * 360d) / (2 * angle * Math.PI);
        }
    }
}
