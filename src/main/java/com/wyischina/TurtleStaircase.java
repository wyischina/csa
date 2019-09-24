package com.wyischina;

import java.util.Scanner;

public class TurtleStaircase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turtle turtle = new Turtle();
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            turtle.forward(10);
            turtle.left(90);
            turtle.forward(10);
            turtle.right(90);
        }
        turtle.forward(10);
        turtle.left(90);
    }

}
