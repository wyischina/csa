package com.wyischina;
import java.util.Scanner;

public class PalindromeExercise {



    /**
     * This method will return true if word is a palindrome, false otherwise.
     * A palindrome is a word when reversed is the same as the original word.
     * For example, "madam" is a palindrome.
     *
     * @param word to test if its a palindrome.
     * @return true if word is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String word) {

        String reversed= "";
        word = word.toUpperCase();
        for (int i = word.length() - 1; i>= 0; i--)
        {
            reversed = reversed + word.charAt(i);
        }
        if (reversed.equals("")) {
            return false;
        }
       if (reversed.equals(word)) {
           return true;
       }
       return false;
    }

}
