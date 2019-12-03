package com.wyischina;

public class APclassroom {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        int low;
        if (a > b && b > c) {
            low = c;
        }
        if (a > b && c > b) {
            low = b;
        }
        else {
            low = a;
        }
        System.out.println(a + b + c - low);
    }
}
