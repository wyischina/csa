package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ComplexNumberTest {

    @Test
    public void testConstructor1(){
        ComplexNumber c = new ComplexNumber(3, 4);
        assertEquals("(3.0 + 4.0i)", c.toString());
    }

    @Test
    public void testConstructor2(){
        ComplexNumber c = new ComplexNumber(10, 100);
        assertEquals("(10.0 + 100.0i)", c.toString());
    }

    @Test
    public void testAdd1(){
        ComplexNumber c = new ComplexNumber(3, 4);
        ComplexNumber n = c.add(new ComplexNumber(3, 4));
        assertEquals(new ComplexNumber(6, 8), n);
    }

    @Test
    public void testAdd2(){
        ComplexNumber c = new ComplexNumber(3, 4);
        ComplexNumber n = c.add(10);
        assertEquals(new ComplexNumber(13, 4), n);
    }

    @Test
    public void testMultiply1(){
        ComplexNumber c = new ComplexNumber(3, 4);
        ComplexNumber n = c.multiply(new ComplexNumber(3, 4));
        assertEquals(new ComplexNumber(9, 16), n);
    }

    @Test
    public void testMultiply2(){
        ComplexNumber c = new ComplexNumber(3, 4);
        ComplexNumber n = c.multiply(10);
        assertEquals(new ComplexNumber(30, 4), n);
    }
}
