package com.wyischina;

import java.util.Scanner;

public class TurtleStaircase {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Scanner scanner = new Scanner(System.in);
        // todo: use a loop to draw the square spiral.
        System.out.println("Put in steps: ");
        int step = scanner.nextInt();
        turtle.forward(30);
        for (int i = 2; i <= step; i++) {
            turtle.left(90);
            turtle.forward(30);
            turtle.right(90);
            turtle.forward(30);
        }
    }
}
