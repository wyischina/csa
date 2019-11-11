package com.wyischina.array;

import java.util.Scanner;

public class IntroductionToArray {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the number n");
        int n = userInput.nextInt();
        int[] someNumbers;
        someNumbers = new int[n];


        for (int i = 1; i <= n; i++) {
            System.out.println("Please enter the number " + i);
            int a = userInput.nextInt();
            someNumbers[i-1] = a;
        }

        for (int i = n; i > 1; i--) {
            System.out.print(someNumbers[i-1] + ",");
        }
        System.out.print(someNumbers[0] + ".");
    }
}

