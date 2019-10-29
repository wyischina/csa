package com.wyischina;

public class MemoryDemonstration {

    public static void main(String[] args) {
        int a = 10;
        String b = "hello ";
        a = methodOne(a);
        System.out.println(b + a);
    }

    public static int methodOne(int b) {
        final int multiple = 2;
        return methodTwo(b * multiple);
    }

    public static int methodTwo(int c) {
        final int divisor = 5;
        return c / 5;
    }

}
