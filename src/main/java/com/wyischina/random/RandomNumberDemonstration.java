package com.wyischina.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberDemonstration {

    private static void printRandomNumbers(int count, int from, int to) {
        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(from + r.nextInt(to + 1));
        }
        System.out.println("random numbers = " + numbers);
    }

    public static void main(String[] args) {
        printRandomNumbers(10, 1, 10);
        printRandomNumbers(10, 1, 10);
        printRandomNumbers(10, 1, 10);
    }

}
