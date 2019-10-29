package com.wyischina.array;

import java.util.Scanner;

public class ArrayExercise1 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number n");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 1; i < n+1; i++){
            System.out.println("please enter number " + i);
            Scanner s1 = new Scanner(System.in);
            int n1 = s1.nextInt();
            arr[i-1] = n1;
        }
        System.out.print("you have entered " );
        for (int i = 0; i < n-1; i++){
            System.out.print(arr[n-1-i] + ", ");
        }
        System.out.print(arr[0] + ".");
    }

}
