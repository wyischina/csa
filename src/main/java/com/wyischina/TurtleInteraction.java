package com.wyischina;

import java.awt.event.KeyEvent;

public class TurtleInteraction {

    private static final Turtle turtle = new Turtle();


    public static void main(String[] args) {
        while (true) {
            int keyCode = turtle.waitForKey();
            System.out.println("key: " + keyCode);
            switch(keyCode) {
                case KeyEvent.VK_UP:
                    turtle.forward(10);
                    break;
                case KeyEvent.VK_DOWN:
                    turtle.backward(10);
                    break;
                case KeyEvent.VK_LEFT:
                    turtle.left(5);
                    break;
                case KeyEvent.VK_RIGHT:
                    turtle.right(5);
                    break;
            }
        }
    }

}
