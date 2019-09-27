package com.wyischina;


import java.awt.*;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        final int numberOfCircles = 10;
        final int penWidth = 15;
        turtle.width(penWidth);
        for(int i = 0; i < numberOfCircles; i++) {
            float saturation = 1 - (i * 1.0f / numberOfCircles);
            Color color = Color.getHSBColor(1, saturation, 1);
            drawCircle(turtle, 10 + 10 * i, 10 + i * 2, color);
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
