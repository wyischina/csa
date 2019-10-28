package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyPointTest {

    @Test
    public void getXTest() {
        MyPoint p = new MyPoint();
        p.getX();
        assertEquals(0, p.getX());
    }

    @Test
    public void setXTest() {
        MyPoint p = new MyPoint();
        p.setX(10);
        assertEquals(10, p.getX());
    }

    @Test
    public void getYTest() {
        MyPoint p = new MyPoint();
        p.getY();
        assertEquals(0, p.getY());
    }

    @Test
    public void setYTest() {
        MyPoint p = new MyPoint();
        p.setY(15);
        assertEquals(15, p.getY());
    }

    @Test
    public void getXYTest() {
        MyPoint p = new MyPoint();
        assertArrayEquals(new int[]{0, 0}, p.getXY());
    }

    @Test
    public void setXYTest() {
        MyPoint p = new MyPoint();
        p.setXY(3, 4);
        assertArrayEquals(new int[]{3, 4}, p.getXY());
    }

    @Test
    public void toStringTest() {
        MyPoint p = new MyPoint();
        p.toString();
        assertEquals("(" + 0 + "," + 0 + ")", p.toString());
    }

    @Test
    public void distanceTest() {
        MyPoint p = new MyPoint();
        p.distance(3, 5);
        assertEquals(Math.sqrt(34), p.distance(3- p.getX(), 5- p.getY()));
    }
}
