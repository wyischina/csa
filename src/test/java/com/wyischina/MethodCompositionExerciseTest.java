package com.wyischina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodCompositionExerciseTest {


    @Test
    void testFactorial5() {
        assertEquals(1*2*3*4*5, MethodCompositionExercise.factorial(5));
    }

    @Test
    void testFactorial1() {
        assertEquals(1, MethodCompositionExercise.factorial(1));
    }

    @Test
    void sine() {
        double result = MethodCompositionExercise.sine(90);
        assertEquals(90 -
                (Math.pow(90, 3) / MethodCompositionExercise.factorial(3)) +
                (Math.pow(90, 5) / MethodCompositionExercise.factorial(5)), result);
    }



}

