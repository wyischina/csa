package com.wyischina;

import java.util.Scanner;

public class PrimeMethodExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number.");
        int a = scanner.nextInt();
        isPrime(a);
    }

    private static void isPrime(int a) {
        int i = 2;
        while (i <= a / 2) {
            int q = a % i;
            if (q == 0) {
                if (i <= 10) {
                    System.out.print(i+ ", ");
                } else {
                    System.out.println("true");
                    break;
                }
            } else if (i == a / 2) {
                System.out.println("false");
                break;
            }
            i++;
        }
    }
}



