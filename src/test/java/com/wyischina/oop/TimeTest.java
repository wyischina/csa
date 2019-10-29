package com.wyischina.oop;

import OOP.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @Test
    public void testGetTime(){
        Time t = new Time(10,10,10);
        assertEquals(10, t.getHour());
        assertEquals(10, t.getMinute());
        assertEquals(10, t.getSecond());
    }

}
