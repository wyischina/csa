package com.wyischina.guessnamegame;

import java.util.Random;

public class NameList {
    String[] nameList= new String[]{
            "Andrew",
            "David",
            "Claire",
            "Jun",
            "Shawn",
            "Matthews",
            "Mark",
            "Jerry",
            "John",
            "Sokol",
            "MrLee",
            "Jessica",
            "JT",
            "Karl",
            "Amanda",
            "Jason",
            "Harry"
    };

    public String getRandomName(){
        Random random = new Random();
        return nameList[random.nextInt(17)];
    }

}
