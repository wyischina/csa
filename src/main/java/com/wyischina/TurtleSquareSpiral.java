package com.wyischina;

import java.util.Scanner;

public class TurtleSquareSpiral {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        // todo: use a loop to draw the square spiral.
        int dist = 20;

        for(int i = 0; i <= 51; i++){

            turtle.left(90);
            turtle.forward(dist);
            dist += 20;
        }
        turtle.left(90);
    }
}

// [(n-2)*180]/2