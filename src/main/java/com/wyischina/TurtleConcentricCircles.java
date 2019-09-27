package com.wyischina;


import java.awt.*;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        for(int i = 0; i < 10; i++) {
            drawCircle(turtle, 10 + 10 * i, 10 + i * 2);
        }
    }


    private static void drawCircle(Turtle t, int radius, int n) {
        System.out.println("drawing circle with radius " + radius + " with " + n + "sides");
        double sectorAngle = 360.0 / n;
        double length = (radius * Math.asin(Math.toRadians(sectorAngle/2))) * 2;
        double innerAngle = (((n-2) * 180d) / n);
        double turnAngle = (180d - innerAngle);
        t.up();
        t.right(90);
        t.forward(radius);
        t.left(innerAngle / 2);
        t.down();
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
