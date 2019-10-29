package com.wyischina.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyPointTest {

    public void testCreateMyPoint() {
        MyPoint x = new MyPoint(10,5);
        assertEquals(10, x.getX());
        assertEquals(5, x.getY());
    }
}
