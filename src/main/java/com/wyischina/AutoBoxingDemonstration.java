package com.wyischina;

public class AutoBoxingDemonstration {

    public static void main(String[] args) {
        Integer i = 1;
        Double d = 1.0;
        String a = "hello world";
        String b = "hello world";
        System.out.println(b.equals(a));
        System.out.println(b == a);
        System.out.println(i.equals(1.0));
        System.out.println(1 == 1.0);
        System.out.println(d.equals(1.0));
    }

}
