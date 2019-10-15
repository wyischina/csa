package com.wyischina;

import java.util.Scanner;

public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        double n = 40;
        drawNgon(turtle, n, 10);
        boolean a = true;

        boolean b = false;

        System.out.print((a == !b) != false);
    }

    public static void drawNgon(Turtle turtle, double n, double length) {
        turtle.speed(1);

        double angle = 180.0 - (((n - 2) * 180.0d) / n);
        double radius = (length * 360d) / (2 * angle * Math.PI);

        turtle.speed(10);
        for (int count = 0; count < 1; count++) {
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
            angle = 180.0d - (((n - 2) * 180.0d) / n);
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
