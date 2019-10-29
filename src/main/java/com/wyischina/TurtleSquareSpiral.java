package com.wyischina;

import java.util.Scanner;

public class TurtleSquareSpiral {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        int r = 50;
        int inCR = 0;

        for(int a=0; a<5; a++){
            turtle.up();
            turtle.left(90);
            turtle.forward(inCR);
            turtle.right(90);
            turtle.left(180);
            turtle.forward(r/2);
            turtle.left(180);
            turtle.down();
            for(int i=0; i<5; i++){

                turtle.forward(r);
                turtle.right(144);

            }
            turtle.up();
            turtle.home();
            inCR = inCR + 10;
            r=r+50;
        }
    }

}
