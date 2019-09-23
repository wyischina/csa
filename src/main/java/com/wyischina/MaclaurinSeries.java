package com.wyischina;

public class MaclaurinSeries {

    public double sine(double x, int k) {
        double acc = 0;
        for (int i = 0; i <= k; i++) {
            double numerator = Math.pow(-1, i) * Math.pow(x, 2 * i + 1);
            double denominator = MethodCompositionExercise.factorial(2 * i + 1);
            double sine = numerator / denominator;
            acc = acc + sine;
        }
        return acc;
    }
}
