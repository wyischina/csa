package com.wyischina.flow;

import java.util.Scanner;

public class FactorExercise {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int n = scanner.nextInt();
        for(int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("Factor: " + i);
            }
        }
    }

}
