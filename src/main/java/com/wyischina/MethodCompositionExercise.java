package com.wyischina;

public class MethodCompositionExercise {


    public static double sine(int x) {
        // todo: Express the maclaurin series for estimating sine(x) in terms of x
        // a composition of the add/subtract/multiply/divide methods. Your expression should only
        // go up to the third term of the maclaurin series.
        //
        // i.e. x - x^3/3! + x^5/5!

        return 0.0;
    }


    public static double factorial(double n) {
        // todo: write a loop that computes the factorial of n

        return 0;
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
