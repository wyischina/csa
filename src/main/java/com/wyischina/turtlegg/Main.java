package com.wyischina.turtlegg;

import java.util.Random;

public class Main {
    public static void main(String[]args){
        Player player = new Player();
        Bomb bomb = new Bomb();
        Random random = new Random();


        while(true){
            if(player.waitForKey() == 83){
                //s
                player.right(90);
                player.forward(10);
                player.left(90);
            } else if(player.waitForKey() == 87){
                //w
                player.left(90);
                player.forward(10);
                player.right(90);
            } else if(player.waitForKey() == 68){
                //d
                player.forward(10);
            }
        }
    }
}
