package com.wyischina.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number n:");
        int n = scanner.nextInt();
        int[] integerN = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.println("Please enter number" + (i+1) + ":");
            integerN[i] = scanner.nextInt();
        }
        for(int i = n-1; i >= 0; i--){
            System.out.print(integerN[i]);
            if(i>0){
                System.out.print(", ");
            }
        }System.out.print(".");
    }
}
