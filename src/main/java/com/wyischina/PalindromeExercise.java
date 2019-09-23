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
        int i = word.length();
        String reverseWord = "";
        while (i > 0){
           reverseWord = reverseWord.concat(word.substring(i,i+1));
            i--;
        }
        return reverseWord.toLowerCase().equals(word.toLowerCase());
    }

}
