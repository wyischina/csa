package com.wyischina;

import java.util.Scanner;

public class PrintNumberAscendingExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        int n = scanner.nextInt();
        if (n > 0) {
            int current = 1;
            do {
                System.out.println(current);
                current = current + 1;
            } while (current <= n);
        } else {
            System.out.println("You must enter a positive number.");
        }
    }

}
