package com.wyischina.io;

import java.util.Scanner;

public class InputOutputDemonstration {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int userInput = inputScanner.nextInt();
        System.out.println("you entered: " + userInput);
    }

}
