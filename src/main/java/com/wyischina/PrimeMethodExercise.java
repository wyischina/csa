package com.wyischina;

public class PrimeMethodExercise {

    public static void main(String[] args) {
        // todo: print out the first 10 primes from 0
        int primeNums = 0;
        for (int i = 2; primeNums < 10; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeNums++;
            }
        }
    }

    public static boolean isPrime(int a){
        // todo: return true if a is prime, false otherwise
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}
