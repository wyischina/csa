package com.wyischina;

public class PrimeMethodExercise {

    public static void main(String[] args) {
        // todo: print out the first 10 primes from 0
        int found = 0;
        int currentNumber = 1;
        while (found < 10) {
            if (isPrime(currentNumber)) {
                System.out.println(currentNumber);
                found++;
            }
            currentNumber++;
        }
    }

    public static boolean isPrime(int a) {
        // todo: return true if a is prime, false otherwise
        for (int i = 2; i <= Math.sqrt(a); i = i + 1) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
