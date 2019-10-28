package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testCircle() {
        Circle c = new Circle();
        assertEquals(1.0, c.getRadius());
    }

    @Test
    public void testGetRadius() {
        Circle c = new Circle();
        c.getRadius();
        assertEquals(1.0, c.getRadius());
    }

    @Test
    public void testGetArea() {
        Circle c = new Circle();
        c.getArea();
        assertEquals(Math.PI, c.getArea());
    }

    @Test
    public void testGetCircumference() {
        Circle c = new Circle();
        c.getCircumference();
        assertEquals(2*Math.PI, c.getCircumference());
    }

    @Test
    public void testToString() {
        Circle c = new Circle();
        c.toString();
        assertEquals("Circle [r=" + 1.0 + "]", c.toString());
    }

}
