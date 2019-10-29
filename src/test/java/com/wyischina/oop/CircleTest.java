package com.wyischina.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    public void testCreateCircle(){
        Circle c = new Circle(5);
        assertEquals(Math.PI * 25, c.getArea());
        assertEquals(Math.PI * 10, c.getCircumference());
    }
}
