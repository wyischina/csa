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
        int previous = 0;
        int latter = 1;
        int result = 0;

        for(int i = 0; i < n; i++){
            result = previous + latter;
            previous = latter;
            latter = result;
        }

        return result ;
    }
}
