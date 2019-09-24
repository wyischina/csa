package com.wyischina;

public class Fibonacci {
    public static void main(String[] args) {
        int fnum = 10;
        int previousnumber = 0;
        int nextnumber = 1;
        System.out.print("Fibonacci Series of "+ fnum +" numbers:");
        for(int i = 1; i < fnum; i++)
        {
            System.out.print(previousnumber+" ");
            int sum = previousnumber + nextnumber;
            previousnumber = nextnumber;
            nextnumber = sum;
        }
    }
}


