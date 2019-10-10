package com.wyischina;

import java.util.Scanner;

public class ExceptionHandlingExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first integer: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the second integer: ");
        int b = scanner.nextInt();

        try{
            System.out.println(a/b);
            System.out.println(a%b);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide integer by zero");
        }
    }

}
