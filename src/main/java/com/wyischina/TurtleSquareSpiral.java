package com.wyischina;

import java.awt.*;
import java.util.Scanner;

public class TurtleSquareSpiral {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        int repeat = 24;
        turtle.left(90);
        int distance = 20;
        Color color = Color.RED;
        for (int x = 0; x < repeat; x++) {
            turtle.forward(distance);
            turtle.left(90);
            turtle.forward(distance);
            turtle.left(90);
            turtle.penColor(color.brighter());
            distance = distance + 20;
        }



        // todo: use a loop to draw the square spiral.
    }

}
