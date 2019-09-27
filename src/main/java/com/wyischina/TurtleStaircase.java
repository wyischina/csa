package com.wyischina;

import java.util.Scanner;

public class TurtleStaircase {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please print the number of steps you'd like the turtle to take: ");
        int steps = scanner.nextInt();
        System.out.println("You wan the turtle to take: " + steps + " steps.");
        // todo: 1) read the number of steps from the user.
        // todo: 2) draw out 5 staircase steps.
        for(int i = 0; i < steps; i++){
            turtle.forward(50);
            turtle.left(90);
            turtle.forward(50);
            turtle.right(90);
        }
    }

}
