package com.wyischina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringMethodExerciseTest {

    @Test
    void reverseString() {
        assertEquals("olleh", ReverseStringMethodExercise.reverseString("hello"));
    }


    @Test
    void reverseEmptyString() {
        assertEquals("", ReverseStringMethodExercise.reverseString(""));
    }


    @Test
    void reverseMixedCaseString() {
        assertEquals("GfEdCbA", ReverseStringMethodExercise.reverseString("AbCdEfG"));
    }
}