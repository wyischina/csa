package com.wyischina;

import java.util.Scanner;

public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        int n = 12;
        drawNgon(turtle, n, 10);
    }

    public static void drawNgon(Turtle turtle, int n, int length) {
        double i = 180-(((n-2)*180) / n);
        double radius = (length * 360) / (2 * i * Math.PI);

        for (int count = 0; count <10; count++) {
            turtle.up();
            turtle.right(90);
            turtle.forward(radius);
            turtle.down();
            turtle.left(90);

            for (int x = 0; x < n; x++) {
                turtle.forward(length);
                turtle.left(i);
            }

            n = n + 2;
            i = 180-(((n-2)*180) / n);
            turtle.up();
            turtle.left(90);
            turtle.forward(radius);
            turtle.down();
            turtle.right(90);

            length = length + 1;

            radius = (length * 360) / (2 * i * Math.PI);
        }
    }



}
