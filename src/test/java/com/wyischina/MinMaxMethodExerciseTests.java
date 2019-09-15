package com.wyischina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxMethodExerciseTests {

    @Test
    void testFindMaxNumber() {
        assertEquals(2, MinMaxMethodExercise.findMaxNumber(1, 2));
    }

    @Test
    void testFindMaxNumberOfSameNumbers() {
        assertEquals(2, MinMaxMethodExercise.findMaxNumber(2, 2));
    }

    @Test
    void testFindMaxNumberOfNegativeNumbers() {
        assertEquals(-3, MinMaxMethodExercise.findMaxNumber(-5, -3));
    }

}
