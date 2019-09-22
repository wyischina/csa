package com.wyischina;

public class MaclaurinSeries {

    public double sine(double x, int n) {
        // todo: calculate x to the nth term.
        double result = 0;
        for (int i = 1; i < n; i+=4){
            result += maclaurinTerm(x, i);
            result -= maclaurinTerm(x, i+2);
        }
        return result;
    }

    public static double factorial(double n) {
        // todo: write a loop that computes the factorial of n
        double result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static double maclaurinTerm(double x, int n) {
        // todo: compute the nth term of maclaurin series
        return Math.pow(x, n)/factorial(n);
    }

}
