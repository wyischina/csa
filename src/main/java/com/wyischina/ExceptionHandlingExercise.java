package com.wyischina;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlingExercise {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // todo
        do {
            try {
                System.out.println("Please input two numbers to divide: ");
                int firstNum = scanner.nextInt();
                int secondNum = scanner.nextInt();

                for (int i = 0; i < 1; i++) {
                    int sum = firstNum / secondNum;
                    int remainder = firstNum % secondNum;
                    System.out.println(sum + "." + remainder);
                }
            } catch (ArithmeticException a) {
                System.out.println("Error!! Cannot compute! Please Try Again");
                System.out.println("-----------------------------------");
            }
        } while(true);
    }
}
