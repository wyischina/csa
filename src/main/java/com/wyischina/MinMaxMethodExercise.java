package com.wyischina;

import java.util.Scanner;

public class MinMaxMethodExercise {

    public static void main(String[] args) {
        System.out.println("Please enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        findMaxNumber(a, b);
    }

    static int findMaxNumber(int a, int b) {
        if (a > b) {
            System.out.println("greater number is: " + a);
            return a;
        } else {
            System.out.println("greater number is: " + b);
            return b;
        }

    }
}