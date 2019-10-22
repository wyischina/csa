package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @Test
    public void testConstructor1(){
        Time t = new Time(23,59,58);
        assertEquals(23, t.getHour());
        assertEquals(59, t.getMinute());
        assertEquals(58, t.getSecond());
    }

    @Test
    public void testSetters1(){
        Time t = new Time(23,59,58);
        t.setHour(1);
        t.setMinute(2);
        t.setSecond(3);
        assertEquals(1, t.getHour());
        assertEquals(2, t.getMinute());
        assertEquals(3, t.getSecond());
    }

    @Test
    public void testSetters2(){
        Time t = new Time(23,59,58);
        t.setTime(1,2,3);
        assertEquals(1, t.getHour());
        assertEquals(2, t.getMinute());
        assertEquals(3, t.getSecond());
    }

    @Test
    public void testToString1(){
        Time t = new Time(23, 59, 58);
        assertEquals("23:59:58", t.toString());
    }

    @Test
    public void testToString2(){
        Time t = new Time(1, 2, 3);
        assertEquals("01:02:03", t.toString());
    }

    @Test
    public void testPreviousSecond(){
        Time t = new Time(23, 59, 58);
        t.previousSecond();
        assertEquals("23:59:57", t.toString());
    }

    @Test
    public void testNextSecond(){
        Time t = new Time(23, 59, 58);
        t.nextSecond();
        assertEquals("23:59:59", t.toString());
    }
}
