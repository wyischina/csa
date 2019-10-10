package com.wyischina;

import java.util.Scanner;

public class ExceptionHandlingExercise {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numerator");
        int x = scanner.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter denominator");
        int y = scanner.nextInt();
        try {
            System.out.println("quotient: " + x/y);
            int c = x % y;
            System.out.println("remainder: " + c);
        } catch (ArithmeticException e) {
            System.out.println("re-enter the number");
            e.printStackTrace();
        }
    }

}
