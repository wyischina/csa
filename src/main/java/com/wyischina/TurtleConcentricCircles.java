package com.wyischina;


import java.awt.*;

public class TurtleConcentricCircles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        // todo: draw concentric circles

        drawCircle(turtle, 45,10);

}

public static void drawCircle(Turtle turtle, int n, int length) {
        int angle;
        angle = 360 /n;

        turtle.up();
        turtle.right(90);
        turtle.forward(50);
        turtle.down();
        turtle.left(90);
    for (int i = 1; i <= n; i++) {
        turtle.forward(10);
        turtle.left(angle);

    }
    turtle.up();
    turtle.home();
}
}
