package com.wyischina;


import java.awt.*;
import java.util.Scanner;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        System.out.println("enter the radius of starting circle");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = (n * Math.PI) / 2;
        double y = x / 90;
        turtle.up();
        turtle.forward(n);
        //turtle.forward(180/Math.PI);
        turtle.left(90);
        turtle.down();
        for (int q = 0; q < 7; q++) {
            for (int i = 0; i <= 360; i++) {
                turtle.forward(y);
                turtle.left(1);
            }
            turtle.up();
            turtle.right(90);
            turtle.forward(20);
            turtle.left(90);
            turtle.down();
            n = n + 20;
            y = ((n * Math.PI) / 2) / 90;
        }
    }
}
