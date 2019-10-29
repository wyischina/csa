package com.wyischina.oop;

import OOP.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyPointTest {

    @Test
    public void testCreateMyPoint() {
        MyPoint p = new MyPoint(10, 20);
        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
    }


    @Test
    public void testDistanceWithParameters() {
        MyPoint p = new MyPoint(10, 20);
        assertEquals(0, p.distance(10, 20));
        assertEquals(10, p.distance(20, 20));
    }
}
