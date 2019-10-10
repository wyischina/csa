package com.wyischina;

import java.util.Scanner;

public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        System.out.println("How many sides would you like to draw?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        drawPolygon(turtle, n, 100);
    }

    private static void drawPolygon(Turtle turtle, int n, int length) {
        for (int i = 0; i <= n; i++){
            turtle.forward(500/n);
            turtle.left(360/n);
        }

        // todo: implement this method to draw a polygon of n-side.
    }

}
