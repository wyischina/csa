package com.wyischina;

import java.util.Scanner;

public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        System.out.println("How many sides would you like to draw?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        drawNgon(turtle, n, 50);
    }

    public static void drawNgon(Turtle turtle, int n, int length) {
        // todo: implement this method to draw a polygon of n-side.
        int polygonAngle = 360/n;

        for(int i = 0; i <= n; i++){
            turtle.forward(length);
            turtle.left(polygonAngle);
        }
    }

}

// [(n-2)*180]/2