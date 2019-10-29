package com.wyischina.array;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input integer n: ");
        int n = in.nextInt();
        int array[] = {};

        //Ask for numbers and append to the empty array
        for (int i = 1; i <= n; i++){
            System.out.print("please enter number " + i + ":");
            int num = in.nextInt();

        }

        //print out array in reverse order
        for (int x = array.length - 1; x >= 0; x--){
            System.out.println(array[x]);
        }
}
}


