package com.wyischina.rougelike;
import java.util.Random;

public class Room {
    private Random r = new Random();
    double seed;

    public Room(int num){
        double randomNum = r.nextDouble();
        seed = randomNum * num + 1;
    }

    public boolean isEnemy(){
        return this.seed < 1.5;
    }
}
