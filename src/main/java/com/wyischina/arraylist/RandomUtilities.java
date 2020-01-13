package com.wyischina.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtilities {

    /**
     * Returns a list of random integers
     * @return List of random integers
     */
    public static final List<Integer> getRandomIntegers() {
        Random r = new Random();
        int bound = 50 + r.nextInt(51);
        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i < bound; i++) {
            integers.add(r.nextInt(100));
        }
        return integers;
    }

}
