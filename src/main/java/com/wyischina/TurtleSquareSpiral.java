package com.wyischina;

import java.util.Scanner;

public class TurtleSquareSpiral {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        int n = 1;
        for(int i = 0; i <= 49; i++) {
            makeBox(turtle, n);
            n=n+20;
        }
    }
    private static void makeBox(Turtle turtle, int n){
        turtle.left(90);
        turtle.forward(20+n);
        turtle.left(90);
        turtle.forward(20+n);


    }

}
