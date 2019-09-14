package com.wyischina;

public class ReverseStringExercise {

    public static void main(String[] args) {
        String text = "William";
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.substring(text.length() - i - 1, text.length() - i));
        }
    }

}
