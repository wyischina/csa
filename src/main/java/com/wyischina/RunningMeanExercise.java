package com.wyischina;

import java.util.Scanner;

public class RunningMeanExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double previousMean = 0;
        while(true) {
            double currentNumber = scanner.nextDouble();
            if (currentNumber < 0 || currentNumber > 100) {
                break;
            }
            previousMean = (currentNumber + previousMean) / 2;
        }
        System.out.println("The running mean: " + previousMean);
    }

}
