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

    public static void drawNgon(Turtle turtle, int n, double length) {
        // todo: implement this method to draw a polygon of n-side.
        double angle = 180 - (n-2) * 180 / n;
        for(int i = 0; i < n; i++){
            turtle.forward(length);
            turtle.left(angle);
        }
    }

}
