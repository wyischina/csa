package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyPointTest {
    @Test
    public void testMyPoint(){
        MyPoint p = new MyPoint();
        assertEquals(0,p.getX());
        assertEquals(0,p.getY());
    }
    @Test
    public void testMyPoint1(){
        MyPoint p = new MyPoint(2,3);
        assertEquals(2,p.getX());
        assertEquals(3,p.getY());
    }
    @Test
    public void testGetX(){
        MyPoint p = new MyPoint(3,4);
        assertEquals(3,p.getX());
    }
    @Test
    public void testGetY(){
        MyPoint p = new MyPoint(4,5);
        assertEquals(5,p.getY());
    }
    @Test
    public void testSetX(){
        MyPoint p = new MyPoint();
        p.setX(1);
        assertEquals(1,p.getX());
    }
    @Test
    public void testSetY(){
        MyPoint p = new MyPoint();
        p.setY(2);
        assertEquals(2,p.getY());
    }
    @Test
    public void testSetXY(){
        MyPoint p = new MyPoint();
        p.setXY(5,6);
        assertEquals(5,p.getX());
        assertEquals(6,p.getY());
    }
    @Test
    public void testGetXY(){
        MyPoint p = new MyPoint();
        assertArrayEquals(new int[]{0,0},p.getXY());
    }
    @Test
    public void testToString(){
        MyPoint p = new MyPoint(2,3);
        assertEquals("(2,3)",p.toString());
    }
    @Test
    public void testDistance0(){
        MyPoint p = new MyPoint();
        assertEquals(2,p.distance(0,2));
    }
    @Test
    public void testDistance1(){
        MyPoint p = new MyPoint();
        assertEquals(5,p.distance(new MyPoint(3,4)));
    }
    @Test
    public void testDistance2(){
        MyPoint p = new MyPoint(0,6);
        assertEquals(6,p.distance());
    }
}
