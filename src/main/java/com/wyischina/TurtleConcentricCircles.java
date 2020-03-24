package com.wyischina;

import java.awt.*;
import java.util.Scanner;

//John Lauron
public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Scanner scanner = new Scanner(System.in);
        turtle.setCanvasSize(500, 500); //sets the canvas size
        turtle.speed(0.5); //changes turtle draw speed to 0.5 delay
        System.out.println("How many circles do you want? (The circles will also determine the radius)");
        int numCircles = scanner.nextInt(); //input the number of concentric circles to draw

        int n = 360; //number of sides in the shape (n-gon)
        double radius;
        double prevPos = 180 - (90 - 360 / (2 * n)); //formula for detecting the previous position of the turtle so when it creates another circle, it knows what position to start from.
        double x = 0.0;
        double y = 0.0;

        //for loop for drawing the concentric circles
        for (int i = 0; i < numCircles; i++) {
            radius = numCircles + (numCircles * i); //increases the radius of the circle as it runs the loop
            turtle.up();
            turtle.setPosition(x, y); //goes back to the center
            turtle.forward(radius); //goes back to its previous distance + radius
            turtle.right(prevPos); //returns to its previous position/angle for drawing
            turtle.down();

            drawCircle(turtle, n, radius); //draws a circle
        }
        //final position of the turtle
        turtle.up();
        turtle.setPosition(x, y);
        turtle.right(180);
    }

    //method for drawing a circle at the center of the canvas
    public static void drawCircle(Turtle turtle, int n, double r) {
        double length = 2 * Math.sin(Math.PI / (n)) * r;
        double angle = 360 / n;
        for (int i = 0; i < n; i++) {
            turtle.forward(length);
            turtle.right(angle);
        }
    }
}
