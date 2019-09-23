package com.wyischina;

public class MaclaurinSeries {

    public double sine(double x, int k) {
        double acc = 0;
        for (int i = 0; i <= k; i++) {
            acc = acc + (Math.pow(-1,i)*Math.pow(x, (2*i)+1) / MethodCompositionExercise.factorial((2*i)+1));
        }
        return acc;
    }
}
