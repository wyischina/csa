package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @Test
    public void testCreateTime() {
        Time t = new Time(20, 30, 30);
        assertEquals(20, t.getHour());
    }

    @Test
    public void testSetGetHour() {
        Time t = new Time(20, 30, 30);
        assertEquals(20, t.getHour());
        t.setHour(19);
        assertEquals(19, t.getHour());
    }
    @Test
    public void testSetGetNextSecond() {
        Time t = new Time(20, 30, 30);
        assertEquals(20, t.getHour());
        Time t2 = t.nextSecond();
        assertEquals(31, t2.getSecond());
        assertEquals(30, t2.getMinute());
        assertEquals(20, t2.getHour());
    }
}
