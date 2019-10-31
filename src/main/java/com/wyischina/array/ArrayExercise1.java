package com.wyischina.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the number n: ");
        int n = s.nextInt();

        int[] list = new int[n];

        for(int i = 1; i <= n; i++){
            System.out.println("Please enter number " + i +":");
            list[i-1] = s.nextInt();
        }

        System.out.print("You have entered ");
        for(int j = list.length - 1; j >= 0 ; j--){
            if(j != 0){
                System.out.print(list[j] + ", ");
            }
            if(j == 0){
                System.out.print(list[j] + ".");
            }
        }
    }
}
