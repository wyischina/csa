package com.wyischina;


import java.awt.*;
import java.util.Scanner;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        System.out.println("enter the radius of starting circle");
        Scanner scanner = new Scanner(System.in);

        //The scanner gets the value of the radius for starting circle

        int n = scanner.nextInt();

        //This calculation finds the distance turtle will move for 1 degrees left

        double x = (n * Math.PI) / 2;
        double y = x / 90;
        float dimmer = 1;
        float color = 0.5f;
        turtle.up();
        turtle.forward(n);
        turtle.left(90);
        turtle.penColor(Color.getHSBColor(color, dimmer, 0.5f));
        turtle.down();
        turtle.speed(1);

        //this is the main loop for drawing ten circles

        for (int q = 0; q < 10; q++) {

            //this loop draws a circle in center, each time with increasing radius value.

            for (int i = 0; i < 360; i++) {
                turtle.forward(y);
                turtle.left(1);
            }
            dimmer = dimmer - 0.15f;
            color = color + 0.05f;
            turtle.up();
            turtle.right(90);
            turtle.forward(10);
            turtle.left(90);
            turtle.penColor(Color.getHSBColor(color, dimmer, 0.5f));
            turtle.down();

            //this code increases the value for radius

            n = n + 10;
            y = ((n * Math.PI) / 2) / 90;
        }

        //after the loop, this code returns the turtle back to it's original position

        turtle.up();
        turtle.left(90);
        turtle.forward(n);
        turtle.left(180);
    }
}
