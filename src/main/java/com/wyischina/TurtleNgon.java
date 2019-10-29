package com.wyischina;

import java.util.Scanner;


public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        System.out.println("How many sides would you like to draw?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("What would you like the starting radius to be?");
        Scanner radius = new Scanner(System.in);
        int r = radius.nextInt();
        drawNgon(turtle, n, 5);
    }

    public static void drawNgon(Turtle turtle, int n, int length) {
        int x = 180-((n-2)*180)/n;
        for(int i=0; i<n; i++){
            turtle.forward(length);
            turtle.left(x);
        }
    }

}
