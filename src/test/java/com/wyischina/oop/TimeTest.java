package com.wyischina.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @Test
    public void testCreateTime() {
        Time t = new Time(20,30,50);
        assertEquals(20, t.getHour());
        assertEquals(30, t.getMinute());
        assertEquals(50, t.getMinute());
    }


}
