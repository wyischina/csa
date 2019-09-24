package com.wyischina;

public class FibonacciSeries {

    /**
     * Compute the nth fibonnaci number.
     *
     * fib(0) == 0
     * fib(1) == 1
     * fib(2) == 0 + 1 == 1
     * fib(3) == 1 + 1 == 2
     * fib(n) == fib(n-1) + fib(n-2)
     *
     * @param n nth term
     * @return the nth fibonnaci number
     */
    public static int fib(int n) {
        int store1 = 0;
        int store2 = 1;
        int i = 0;

        for (int x = 0; x < n; x++) {
            i = store1 + store2;
            store1 = store2;
            store2 = i;
        }
        return i;
    }
}