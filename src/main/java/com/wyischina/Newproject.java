package com.wyischina;

import java.util.Scanner;

class newProject {


    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        System.out.println("Enter a number (for the series)");
        inputNumber = scanner.nextInt();

        System.out.print(calcValue(inputNumber));



    }

    public static int calcValue (int inputNumber) {
        int a = 0;
        int b = 1;
        int sum = 0;
        int printedInteger = 0;
        for(int i = 0; i < inputNumber - 2; i++){
            sum = a+b;
            a=b;

        }


        return printedInteger;
    }


}
