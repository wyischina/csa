package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyPointTest {
    @Test
    public void TestCreateMyPoint() {
        MyPoint m1 = new MyPoint();
        m1.setX(3);
        assertEquals(3, m1.getX());
    }
    @Test
    public void TestDistance() {
        MyPoint m1 = new MyPoint();
        m1.setX(3);
        m1.setY(4);
        assertEquals(5, m1.distance(0,0));
    }
}
