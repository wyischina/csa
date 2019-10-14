package com.wyischina;

import java.util.Scanner;

public class ExceptionHandlingExercise {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // todo
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Please enter your dividend: ");
            int dividend = s.nextInt();
            System.out.println("Please enter your divisor: ");
            int divisor = s.nextInt();
            try {
                System.out.println("The quotient is: " + dividend/divisor);
                System.out.println("The remainder is: " + dividend%divisor);
            } catch (ArithmeticException a) {
                System.out.println("There is a problem with the arithmetic!");
                System.out.println("Please do not divide a number by zero.");
            }

        }while(true);
    }
}
