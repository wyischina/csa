package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testConstructor1(){
        Circle c = new Circle();
        assertEquals(1.0, c.getRadius());
    }

    @Test
    public void testConstructor2(){
        Circle c = new Circle(2.0);
        assertEquals(2.0, c.getRadius());
    }

    @Test
    public void testSetRadius1(){
        Circle c = new Circle();
        c.setRadius(5.0);
        assertEquals(5.0, c.getRadius());
    }

    @Test
    public void testGetArea1(){
        Circle c = new Circle();
        assertEquals(Math.PI, c.getArea());
    }

    @Test
    public void testGetCircumference1(){
        Circle c = new Circle();
        assertEquals(Math.PI*2, c.getCircumference());
    }

    @Test
    public void testToString(){
        Circle c = new Circle();
        assertEquals("Circle[radius=1.0]", c.toString());
    }
}
