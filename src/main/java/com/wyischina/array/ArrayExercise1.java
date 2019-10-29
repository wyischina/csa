package com.wyischina.array;

import java.util.Scanner;

public class ArrayExercise1 {

    public static void main(String[] arg) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the number n");
        int n = inputScanner.nextInt();

        int[] store = new int[n];

        for (int i = 1; i <= store.length; i++) {
            System.out.println("Please enter number " + i);
            int n1 = inputScanner.nextInt();
            store[i - 1] = n1;
        }

        System.out.print("You have entered ");

        for (int count = store.length - 1 ; count >=  0; count--) {
            System.out.print(store[count]);
            if (count > 0) {
                System.out.print(", ");
            }
        }
        System.out.print(".");
    }
}
