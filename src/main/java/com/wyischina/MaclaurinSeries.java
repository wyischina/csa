package com.wyischina;

public class MaclaurinSeries {

    public double sine(double x, int k) {

        double total= 0;
        for (int i = 0; i <= k; i++) {
            double subterm = 2 * i + 1;
            double term = Math.pow((-1), i) * (Math.pow(x, subterm)) / (factorial(subterm));
            total = total + term;

        }
        return total;
    }
    public double factorial(double number) {
        int fact = 1;
        for (int i= 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
