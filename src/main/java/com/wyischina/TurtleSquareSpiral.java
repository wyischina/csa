package com.wyischina;

import java.util.Scanner;

public class TurtleSquareSpiral {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        for(int i = 1; i<=24; i++){
            turtle.left(90);
            turtle.forward(20 * i);
            turtle.left(90);
            turtle.forward(20 * i);
        }
    }

}
