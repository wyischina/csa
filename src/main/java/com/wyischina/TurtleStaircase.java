package com.wyischina;

public class TurtleStaircase {

    public static void main(String args[]) {
        Turtle turtle = new Turtle();
        for(int i = 0; i < 10; i++) {
            turtle.forward(20);
            turtle.left(90);
            turtle.forward(20);
            turtle.right(90);
        }
    }

}
