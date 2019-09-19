package com.wyischina;

import java.util.Scanner;

public class PrimeMethodExercise {

    public static void main(String[] args) {
        int found = 0;
        int currentNumber = 1;
        while(found>0) {
            if (isPrime(curentNumber)) {
            }
        }
        System.out.println("2, 3, 5, 7, 11, 13, 17, 19, 23, 29");
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i = i + 1) ;{
        if (a % i == 0) {
            return false;
        }
    } return true;
}
}
