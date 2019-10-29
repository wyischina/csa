package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    @Test
    public void testCreateCircle() {
        Circle c = new Circle();
        c.setRadius(4.0);
        assertEquals(4.0, c.getRadius());
    }
    @Test
    public void testSetCircumference() {
        Circle c = new Circle();
        c.setRadius(4.0);
        assertEquals(8.0 * Math.PI, c.getCircumference());
    }
    @Test
    public void testPrintCircle() {
        Circle c = new Circle();
        c.setRadius(4.0);
        assertEquals("Circle[radius=4.0]", c.toString());
    }
}
