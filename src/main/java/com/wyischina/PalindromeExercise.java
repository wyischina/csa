package com.wyischina;

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
        String reversed = "";
        for(int i = 0; i < word.length(); i++) {
            reversed = word.substring(i, i+1) + reversed;
        }
        return reversed.toLowerCase().equals(word.toLowerCase());
    }


}
