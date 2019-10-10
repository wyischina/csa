package com.wyischina;

import java.util.Scanner;

public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        int n = 12;
        drawNgon(turtle, n, 10);
    }

    public static void drawNgon(Turtle turtle, int n, double length) {
        turtle.speed(1);

        double angle = 180 - (((n - 2) * 180d) / n);
        double radius = (length * 360d) / (2 * angle * Math.PI);
        //double radius = (length * Math.sin((180d - angle) / 2)) / Math.sin(angle);

        turtle.speed(10);
        for (int count = 0; count < 10; count++) {
            turtle.up();
            turtle.right(90);
            turtle.forward(radius);
            turtle.right(90);
            turtle.forward(10);
            turtle.down();
            turtle.left(180);

            for (int drawCircle = 0; drawCircle < n; drawCircle++) {
                turtle.forward(length);
                turtle.left(angle);
            }

            n = n + 2;
            angle = 180 - (((n - 2) * 180d) / n);
            turtle.up();
            turtle.forward(10);
            turtle.left(90);
            turtle.forward(radius);
            turtle.down();
            turtle.right(90);

            length++;

            radius = (length * 360d) / (2 * angle * Math.PI);

        }
    }
}
