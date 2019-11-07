package com.wyischina.array;

import java.util.Scanner;

public class ArrayExercise1 {

    public static void main(String[] args) {
        System.out.println("Please enter the number n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Please enter number " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        System.out.print("The numbers you have entered are ");
        for(int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

}
