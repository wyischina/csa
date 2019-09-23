package com.wyischina;

public class FibonacciSeriesLoop {

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
        int prior = 0;
        int latter = 1;
        if (n == 0 || n == 1){
            return n;
        }
        for (int i = 1; i < n; i++){
            prior += latter;

            int temp = prior;
            prior = latter;
            latter = temp;
        }
        return latter;
    }
}
