package com.wyischina;

public class FibonacciSeries {

    /**
     * Compute the nth fibonnaci number.
     * <p>
     * fib(0) == 0
     * fib(1) == 1
     * fib(2) == 0 + 1 == 1
     * fib(3) == 1 + 1 == 2
     * fib(n) == fib(n-1) + fib(n-2)
     *
     * @param n nth term
     * @return
     */


    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        if (n < 2) {
            return n;
        } else {
            for (int i= 0; i <= n-1; i++) {
                c = a + b;
                a = b;
                b= c;
            }
        }
        return c;
    }
}
