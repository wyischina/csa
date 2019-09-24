package com.wyischina;

import java.util.Scanner;

public class TurtleStaircase {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a positive number");
        int x = scanner.nextInt();

        turtle.forward(30);
        for (int i = 0; i < x; i++) {
            turtle.left(90);
            turtle.forward(30);
            turtle.right(90);
            turtle.forward(30);
        }


        // todo: 1) read the number of steps from the user.
        // todo: 2) draw out 5 staircase steps.
    }

}
