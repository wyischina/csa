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
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int nMinus2 = 0;
        int nMinus1 = 1;
        int current = 0;
        for(int i = 2; i <= n; i++) {
            current = nMinus2 + nMinus1;
            nMinus2 = nMinus1;
            nMinus1 = current;
        }
        return current;
    }
}
