package com.wyischina.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number n");
        int number = scanner.nextInt();
        int[] n= new int[number];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Please enter number " + (i + 1));
            n[i] = scanner.nextInt();


        }
        // Input is from recent to previous
        System.out.print("You input is ");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
            System.out.print(".");
    }
}
