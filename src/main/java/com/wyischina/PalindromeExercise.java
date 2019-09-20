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
        StringBuilder reversedWord = new StringBuilder();
        word = word.toUpperCase();
        if (word.trim().equals("")){
            return false;
        }
        for (int i = word.length(); i > 0; i--){
            reversedWord.append(word.substring(i - 1, i));
        }
        return word.equals(reversedWord.toString());
    }


}
