package com.wyischina;

import java.util.Scanner;

public class TurtleSquareSpiral {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Scanner inputScanner= new Scanner (System.in);
        // todo: use a loop to draw the square spiral.
        int loops = inputScanner.nextInt();
        int distance= 20;

        for (int i = 2; i <= loops; i++) {
            turtle.left(90);
            turtle.forward(distance);
            distance = distance + 10;
        }
        turtle.left(90);
        }
    }

