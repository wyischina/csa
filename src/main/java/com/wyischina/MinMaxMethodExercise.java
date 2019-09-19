package com.wyischina;

import java.util.Scanner;

public class MinMaxMethodExercise {

    public static void main(String[] args) {
        System.out.println("Please enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int biggestNumber;
        if (firstNumber > secondNumber) {
            biggestNumber = firstNumber;
        } else {
            biggestNumber = secondNumber;
        }
        System.out.println("max number is " + biggestNumber);
    }

    public static int findMaxNumber(int a, int b) {
        if(a>b) {
            return a;
        }else{
            return b;
        }
    }

}
