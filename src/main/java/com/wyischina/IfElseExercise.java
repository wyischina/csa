package com.wyischina;

import java.util.Scanner;

public class IfElseExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");

        int age = scanner.nextInt();
        if (age > 17) {
            System.out.println("You are getting old");
            System.out.println("You are getting old");
        } else {
            System.out.println("You are underaged");
        }

    }

}
