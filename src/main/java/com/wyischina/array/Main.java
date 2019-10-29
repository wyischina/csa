package com.wyischina.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] someData;
        System.out.println("put in the number n");
        int n = scanner.nextInt();
        someData = new int[n];

        int a;
        for(int i=0;i<n;i++){
            System.out.println("please enter the number" + " "+ (i+1));
            a = scanner.nextInt();
            someData[i]=a;
        }
        for(int i=1;i<=n;i++){
            if(i<n){
                System.out.print(someData[n-i]+", ");
            }else{
                System.out.print("and " + someData[0]+".");
            }

        }
    }
}
