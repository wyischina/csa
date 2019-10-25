package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(new ComplexNumber(6, 8), c.add(new ComplexNumber(3, 4)));
    }

    @Test
    public void testAdd2(){
        ComplexNumber c = new ComplexNumber(3, 4);
        assertEquals(new ComplexNumber(13, 4), c.add(10));
    }

    @Test
    public void testMultiply1(){
        ComplexNumber c = new ComplexNumber(3, 4);
        assertEquals(new ComplexNumber(0, 25), c.multiply(new ComplexNumber(4, 3)));
    }

    @Test
    public void testMultiply2(){
        ComplexNumber c = new ComplexNumber(3, 4);
        assertEquals(new ComplexNumber(30, 40), c.multiply(10));
    }

    @Test
    public void testDivision1(){
        ComplexNumber c = new ComplexNumber(3, 4);
        assertEquals(new ComplexNumber(24/25d, 7/25d), c.division(new ComplexNumber(4, 3)));
    }

    @Test
    public void testDivision2(){
        ComplexNumber c = new ComplexNumber(3, 4);
        assertEquals(new ComplexNumber(1, 4/3d), c.division(3));
    }

    @Test
    public void testConjugate(){
        ComplexNumber c = new ComplexNumber(3, 4);
        assertEquals(new ComplexNumber(3, -4), c.conjugate());
    }

    @Test
    public void testPolar(){
        ComplexNumber c = new ComplexNumber(3, 4);
        assertEquals(new PolarCoordinate(5, Math.atan(4/3d)), c.polar());
    }
}
