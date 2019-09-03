package com.wyischina.flow;

import java.util.Scanner;

public class PracticeA3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Please enter a positive integer:");
            n = scanner.nextInt();
        } while (n <= 0);
        int current = 1;
        do {
            System.out.println(current);
            current = current + 1;
        } while (current <= n);
    }

}
