package com.wyischina;

public class MaclaurinSeries {

    public double sine(double x, int k) {
        double total = 0;

        for(int i = 0; i <= k; i++){
            double term = (Math.pow(-1, i) * Math.pow(x, 2*i+1)) / factorial(2*i+1);
            total += term;
        }
        return total;
    }

    public static double factorial(int n) {
        // todo: write a loop that computes the factorial of n
        double factorial = 1.0;

        for(int i = 2; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

}
