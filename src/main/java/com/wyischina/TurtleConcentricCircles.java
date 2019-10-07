package com.wyischina;


import java.awt.*;
import java.util.Scanner;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        final int numberOfCircles = 10;
        final int penWidth = 1;
        turtle.width(penWidth);
        Scanner scanner = new Scanner(System.in);
        turtle.speed(5);
        Color color = Color.BLACK;
        while(true) {
            double randomHue = 0; // Math.random();
            for(int i = 0; i < numberOfCircles; i++) {
                // float saturation = 1 - (i * 1.0f / numberOfCircles);
                // Color color = Color.getHSBColor((float) randomHue, saturation, 1);
                drawCircle(turtle, 10 + 10 * i, 10 + i * 2, color);
            }
            System.out.println("Press enter to run again");
            scanner.nextLine();
            turtle.clear();
        }
    }


    private static void drawCircle(Turtle t, int radius, int n, Color color) {
        System.out.println("drawing circle with radius " + radius + " with " + n + " sides");
        double sectorAngle = 360.0 / n;
        double length = (radius * Math.asin(Math.toRadians(sectorAngle/2))) * 2;
        double innerAngle = (((n-2) * 180d) / n);
        double turnAngle = (180d - innerAngle);
        t.up();
        t.right(90);
        t.forward(radius);
        t.left(innerAngle / 2);
        t.down();
        t.penColor(color);
        for (int i = 0; i < n; i++) {
            t.left(turnAngle);
            t.forward(length);
        }
        t.up();
        t.right(innerAngle / 2 + 180);
        t.forward(radius);
        t.right(90);
    }

}
