package com.wyischina.flow;

import java.util.Scanner;

public class DoWhileDemonstration {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        double highestNumber = Double.MIN_VALUE;
        do {
            System.out.println("Please enter a number: (Press enter to quit)");
            userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            // convert user entered string into a double number
            double currentNumber = Double.parseDouble(userInput);
            if (currentNumber > highestNumber) {
                highestNumber = currentNumber;
            }
        } while (true);
        System.out.println("Bye bye");
    }


}
