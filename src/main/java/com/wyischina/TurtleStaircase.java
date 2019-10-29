package com.wyischina;

import java.util.Scanner;

public class TurtleStaircase {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.speed(1);

        //n=number of triangles
        double numberofTriangle = 40;
        //r= radius value
        int radius = 50;

        //drawing starts here
        for(int i = 0; i<10; i++){
            drawCircle(turtle, numberofTriangle, radius);
            radius= radius+20;
        }



    }
    private static void drawCircle(Turtle turtle, double numberofSides, int radius){
        //pivot angle of the triangle
        double pivotAngle = 360.0/numberofSides;

        //angle of the turn
        double turnAngle = ((90-(90-((pivotAngle)/2)))*2);

        //moving down
        turtle.up();
        turtle.right(90);
        turtle.forward(radius);
        turtle.left(90-turnAngle/2);
        turtle.down();

        //circle starts here
        for(int i=0; i<numberofSides; i++){
                turtle.left(turnAngle);
                turtle.forward(2*(radius*Math.sin(Math.toRadians(pivotAngle/2))));

        }

        //going back up
        turtle.up();
        turtle.left(90+turnAngle/2);
        turtle.forward(radius);
        turtle.right(90);



    }

}
