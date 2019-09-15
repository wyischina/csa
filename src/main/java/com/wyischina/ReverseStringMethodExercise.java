package com.wyischina;


public class ReverseStringMethodExercise {

    /**
     * Exercise: complete the code of this method that will reverse the characters of the input string.
     * @param input string
     * @return the reversed input string
     */
    public static String reverseString(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.substring(i, i+1) + output;
        }
        return output;
    }

}
