package com.wyischina;

import java.util.Scanner;

public class TurtleNgon {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        System.out.println("How many sides would you like to draw?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        drawNgon(turtle, n, 100);
    }

    public static void drawNgon(Turtle turtle, int n, int length) {
        int x = 180-((n-2)*180)/n;
        int l = length;
        for (int i = 0; i < n*n; i++){
            if (i % n == 0){
                l = (l/2);
                }
            turtle.forward(l);
            turtle.left(x);
        }
    }

}
