package com.wyischina.io;

import java.util.Scanner;

public class InputOutputDemonstration {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = inputScanner.nextInt();
        System.out.println("you entered: " + userInput);
    }

}
