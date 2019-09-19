package com.wyischina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeExerciseTest {

    @Test
    void isPalidrome1() {
        assertTrue(PalindromeExercise.isPalindrome("madam"));
    }


    @Test
    void isPalidrome2() {
        assertTrue(PalindromeExercise.isPalindrome("rotor"));
    }

    @Test
    void isNotPalindrome1() {
        assertFalse(PalindromeExercise.isPalindrome("mad"));
    }

    @Test
    void isNotPalindrome2() {
        assertFalse(PalindromeExercise.isPalindrome("Mad"));
    }

    @Test
    void isPalindromeEmptyString() {
        assertFalse(PalindromeExercise.isPalindrome(""));
    }

    @Test
    void isPalidromeCaseInsensitive() {
        assertTrue(PalindromeExercise.isPalindrome("Madam"));
    }

}