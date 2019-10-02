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
        int i = 180-(n-2)*180 / n;
        for (int x = 100; x < n; x++) {
            turtle.forward(length);
            turtle.left(i);
        }
    }



}
