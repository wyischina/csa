package com.wyischina;

import java.util.Scanner;

public class PrintNumberDescendingExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        int n = scanner.nextInt();
        if (n > 0) {
            do {
                System.out.println(n);
                n = n - 1;
            } while (n > 0);
        } else {
            System.out.println("You must enter a positive number.");
        }
    }

}
