package com.wyischina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeMethodExerciseTests {

    @Test
    public void testIsPrimeWithARealPrime() {
        assertTrue(PrimeMethodExercise.isPrime(13));
    }

    @Test
    public void testIsPrimeWithAEvenNumber() {
        assertFalse(PrimeMethodExercise.isPrime(12));
    }
}
