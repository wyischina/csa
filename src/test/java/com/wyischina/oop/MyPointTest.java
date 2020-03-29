package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyPointTest {

    @Test
    public void testConstructor1(){
        MyPoint p = new MyPoint();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    public void testConstructor2(){
        MyPoint p = new MyPoint(1,1);
        assertEquals(1, p.getX());
        assertEquals(1, p.getY());
    }

    @Test
    public void testSetX1(){
        MyPoint p = new MyPoint();
        p.setX(1);
        assertEquals(1, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    public void testSetY1(){
        MyPoint p = new MyPoint();
        p.setY(1);
        assertEquals(0, p.getX());
        assertEquals(1, p.getY());
    }

    @Test
    public void testSetXY1(){
        MyPoint p = new MyPoint();
        p.setXY(1, 1);
        assertEquals(1, p.getX());
        assertEquals(1, p.getY());
    }

    @Test
    public void testToString1(){
        MyPoint p = new MyPoint();
        assertEquals("(0,0)", p.toString());
    }

    @Test
    public void testDistance1(){
        MyPoint p = new MyPoint();
        assertEquals(0, p.distance());
    }

    @Test
    public void testDistance2(){
        MyPoint p = new MyPoint();
        MyPoint q = new MyPoint(3,4);
        assertEquals(5, p.distance(q));
    }

    @Test
    public void testGetXY1(){
        MyPoint p = new MyPoint();
        assertArrayEquals(new int[]{0, 0}, p.getXY());
    }
}
