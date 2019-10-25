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
    public void testPreviousSecond1(){
        Time t = new Time(23, 59, 58);
        Time c = t.previousSecond();
        assertEquals("23:59:57", c.toString());
    }

    @Test
    public void testPreviousSecond2(){
        Time t = new Time(23, 59, 0);
        Time c = t.previousSecond();
        assertEquals("23:58:59", c.toString());
    }

    @Test
    public void testPreviousSecond3(){
        Time t = new Time(23, 0, 0);
        Time c = t.previousSecond();
        assertEquals("22:59:59", c.toString());
    }

    @Test
    public void testPreviousSecond4(){
        Time t = new Time(0, 0, 0);
        Time c = t.previousSecond();
        assertEquals("23:59:59", c.toString());
    }

    @Test
    public void testNextSecond1(){
        Time t = new Time(23, 59, 58);
        Time c = t.nextSecond();
        assertEquals("23:59:59", c.toString());
    }

    @Test
    public void testNextSecond2(){
        Time t = new Time(23, 58, 59);
        Time c = t.nextSecond();
        assertEquals("23:59:00", c.toString());
    }

    @Test
    public void testNextSecond3(){
        Time t = new Time(22, 59, 59);
        Time c = t.nextSecond();
        assertEquals("23:00:00", c.toString());
    }

    @Test
    public void testNextSecond4(){
        Time t = new Time(23, 59, 59);
        Time c = t.nextSecond();
        assertEquals("00:00:00", c.toString());
    }
}
