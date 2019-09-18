package com.wyischina;

public class MethodCompositionExercise {


    public static double sine(int x) {
        // a composition of the add/subtract/multiply/divide methods. Your expression should only
        // go up to the third term of the maclaurin series.
        //
        // i.e. x - x^3/3! + x^5/5!
        return add(subtract(x, divide(power(x, 3), factorial(3))), divide(power(x, 5), factorial(5)));
    }


    public static double factorial(double n) {
        long expected = 1;
        for (int k = 1; k <= n; k++) {
            expected = expected * k;
        }
        return expected;
    }

    public static double add(double a, double b) {
        return a + b;
    }


    public static double subtract(double a, double b) {
        return a - b;
    }


    public static double multiply(double a, double b) {
        return a * b;
    }


    public static double divide(double a, double b) {
        return a / b;
    }


    public static double power(double a, double n) {
        return Math.pow(a, n);
    }


}
