package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @Test
    public void testGetHour() {
        Time t = new Time(1, 0, 0);
        {
            t.getHour();
            assertEquals(1, t.getHour());
        }
    }

    @Test
    public void testGetMinute() {
        Time t = new Time(0, 1, 0);
        {
            t.getMinute();
            assertEquals(1, t.getMinute());
        }
    }

    @Test
    public void testGetSecond() {
        Time t = new Time(0, 0, 1);
        {
            t.getSecond();
            assertEquals(1, t.getSecond());
        }
    }

    @Test
    public void testSetMinute() {
        Time t = new Time(0, 1, 0);
        t.setMinute(1);
        assertEquals(1, t.getMinute());
    }

    @Test
    public void testSetHour() {
        Time t = new Time(1, 1, 1);
        {
            t.setHour(1);
            assertEquals(1, t.hour);
        }
    }

    @Test
    public void testSetSecond() {
        Time t = new Time(1, 1, 1);
        {
            t.setSecond(1);
            assertEquals(1, t.second);
        }
    }

    @Test
    public void testSetTime() {
        Time t = new Time(1, 1, 1);
        {
            t.setTime(1, 2, 3);
            assertEquals(1, t.hour);
            assertEquals(2, t.minute);
            assertEquals(3,t.second);
        }
    }

    @Test
    public void testToString(){
        Time t = new Time(1, 2, 3); {
            t.toString();
            assertEquals(1 + ":" + 2 + ":" + 3,t.toString());
        }
    }

    @Test
    public void testNextSecond(){
        Time t = new Time(23, 59, 59); {
            Time c = t.nextSecond();
            assertEquals(0, c.hour);
            assertEquals(0, c.minute);
            assertEquals(0, c.second);
        }
    }

    @Test
    public void testPreviousSecond(){
        Time t = new Time(0, 1, 58); {
            Time c = t.previousSecond();
            assertEquals(0, c.hour);
            assertEquals(1, c.minute);
            assertEquals(57, c.second);
        }
    }

}
