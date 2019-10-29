package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexNumberTest {
    @Test
    public void TestComplexNumber(){
        ComplexNumber c1 = new ComplexNumber(2, 5);
        ComplexNumber c2 = new ComplexNumber(4, 3);
        assertEquals(c1.multiply(c2).getReal(), -7);
    }
}
