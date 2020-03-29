package com.wyischina.array;

import java.util.*;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner integerInput = new Scanner(System.in);

        System.out.println("Please enter the number n:");
        int n = integerInput.nextInt();

        int[] userInputs= new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Please enter number " + (i+1) + ":");
            userInputs[i] = integerInput.nextInt();
        }

        System.out.print("You have entered ");
        for(int i = userInputs.length-1; i >= 0; i--){
            System.out.print(userInputs[i]);
            if(i == 0){
                System.out.print(".");
                break;
            }
            if(i == 1){
                System.out.print(" and ");
            }else {
                System.out.print(", ");
            }
        }
    }
}
