package com.wyischina;

import java.util.Scanner;

public class TurtleStaircase {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++)
        {
            turtle.forward(50);
            turtle.left(90);
        }
    }
}

