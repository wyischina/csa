package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    @Test
    public void testGetHour(){
        Time t = new Time(21,30,43);
        assertEquals(21, t.getHour());
    }
    @Test
    public void testGetMinute(){
        Time t = new Time(21,30,43);
        assertEquals(30,t.getMinute());
    }
    @Test
    public void testGetSecond(){
        Time t = new Time(21,30,43);
        assertEquals(43,t.getSecond());
    }
    @Test
    public void testSetHour(){
        Time t = new Time(0,0,0);
        t.setHour(4);
        assertEquals(4,t.hour);
    }
    @Test
    public void testSetMinute(){
        Time t = new Time(0,0,0);
        t.setMinute(7);
        assertEquals(7,t.minute);
    }
    @Test
    public void testSetSecond(){
        Time t = new Time(0,0,0);
        t.setSecond(39);
        assertEquals(39,t.second);
    }
    @Test
    public void testSetTime(){
        Time t = new Time(0,0,0);
        t.setTime(11,22,33);
        assertEquals(11,t.hour);
        assertEquals(22,t.minute);
        assertEquals(33,t.second);
    }
    @Test
    public void testNextSecond(){
        Time t = new Time(23,59,59);
        t.nextSecond();
        assertEquals(0,t.getHour());
        assertEquals(0,t.getMinute());
        assertEquals(0,t.getSecond());
    }

    @Test
    public void testPreviousSecond(){
        Time t = new Time(1,0,0);
        t.previousSecond();
        assertEquals(0,t.getHour());
        assertEquals(59,t.getMinute());
        assertEquals(59,t.getSecond());
    }

    @Test
    public void testToString(){
        Time t = new Time(1,2,3);
        assertEquals("1:2:3",t.toString());
    }
}
