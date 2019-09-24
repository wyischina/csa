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
        if (n == 0){
            return 0;
        }
        int a = 0;
        int b = 1;
        for (int i = 1; i < n; i++){
                int c = a + b;
                a = b;
                b = c;
        }
        return b;
        }
    }
