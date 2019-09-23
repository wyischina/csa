package com.wyischina;

public class MethodCompositionExercise {


    public static double sine(int x) {
        // todo: Express the maclaurin series for estimating sine(x) in terms of
        // a composition of the add/subtract/multiply/divide methods. Your expression should only
        // go up to the third term of the maclaurin series.
        //
        // i.e. x - x^3/3! + x^5/5!
        double sineX =  add(subtract( x , divide(power(x,3) , factorial(3))) , divide(power(x , 5) , factorial(5)));

        // i.e. 5! * (5 - 2)
        return multiply(factorial(5), subtract(5, 2));
    }


    public static double factorial(int n) {
        // todo: write a loop that computes the factorial of n
        double factorial = 1.0;

        for(int i = 1; i <= n; i++){
            factorial = multiply(factorial, i);
        }
        return factorial;
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
