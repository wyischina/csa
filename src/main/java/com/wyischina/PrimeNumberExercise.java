package com.wyischina;

import java.util.Scanner;

public class PrimeNumberExercise {

    public static void main(String args[]) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean foundFactor = false;

        for (int i = 2; i < Math.sqrt(n); i = i+1) {
            if (n % i == 0) {
                System.out.println("The factor is " + i);
                foundFactor = true;
                break;
            }
        }
        if (foundFactor) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
