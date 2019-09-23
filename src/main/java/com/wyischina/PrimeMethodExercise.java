package com.wyischina;

import java.util.Scanner;

public class PrimeMethodExercise {

    public static void main(String[] args) {
        // todo: print out the first 10 primes from 0
        int numberOfPrimesFound = 0;
        int currentNumber = 2;
        do {
            if (isPrime(currentNumber)) {
                System.out.println(currentNumber);
                numberOfPrimesFound++;
            }
            currentNumber++;
        } while (numberOfPrimesFound < 10);
    }

    public static boolean isPrime(int a) {
        // todo: return true if a is prime, false otherwise
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
               return false;
            }
        }
        return true;
    }

}
