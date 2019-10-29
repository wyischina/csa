package com.wyischina;

public class TurtleSquare {

    public static void main(String args[]) {
        Turtle turtle = new Turtle();
        int n = 50;
        for(int i =0; i<10; i++){
            mSquare(turtle, n);
            n = n+50;
        }
    }
    private static void mSquare(Turtle turtle, int n){
        for(int i = 0; i < 2; i++) {
            turtle.left(90);
            turtle.forward(50+ n);


        }
    }

}
