package com.wyischina;

import java.util.Scanner;


public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        System.out.println("How many sides would you like to draw?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        drawNgon(turtle, n, 100);
    }

    public static void drawNgon(Turtle turtle, int n, int length) {
        // todo: implement this method to draw a polygon of n-side.
        int angle;
        angle = 360 / n;
        for (int i= 1; i <= n; i++) {
            turtle.forward(20);
            turtle.left(angle);
        }
    }

}
