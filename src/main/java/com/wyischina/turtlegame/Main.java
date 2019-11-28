package com.wyischina.turtlegame;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        AI ai = new AI(1);

        while (true) {
            KeyEvent keyEvent = null;
            assert false;
            keyEvent.setKeyChar('d');
            movement(user, keyEvent);
        }
    }
    private static void movement(User user, KeyEvent e){
        user.turtle.keyTyped(e);
        user.turtle.forward(10);
    }
}
