package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    @Test
    public void testCircleConstructor1(){
        Circle c = new Circle();
        assertEquals(1.0,c.getRadius());
    }

    @Test
    public void testCircleConstructor2(){
        Circle c = new Circle(2.0);
        assertEquals(2.0,c.getRadius());
    }

    @Test
    public void testGetRadius(){
        Circle c = new Circle();
        assertEquals(1.0,c.getRadius());
    }

    @Test
    public void testSetRadius(){
        Circle c = new Circle();
        c.setRadius(3.0);
        assertEquals(3.0,c.getRadius());
    }

    @Test
    public void testGetArea(){
        Circle c = new Circle();
        assertEquals(Math.PI,c.getArea());
    }

    @Test
    public void testGetCircumference(){
        Circle c = new Circle();
        assertEquals(2*Math.PI,c.getCircumference());
    }

    @Test
    public void testToString(){
        Circle c = new Circle();
        assertEquals("Circle[radius = 1.0]",c.toString());
    }
}
