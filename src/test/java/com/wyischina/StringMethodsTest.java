package com.wyischina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMethodsTest {

    @Test
    void padLeftOver() {
        assertEquals("xxxxxHello", new StringMethods().padLeft("Hello", 10, 'x'));
    }

    @Test
    void padLeftEquals() {
        assertEquals("Hello", new StringMethods().padLeft("Hello", 5, 'x'));
    }

    @Test
    void padLeftUnder() {
        assertEquals("Hello", new StringMethods().padLeft("Hello", 3, 'x'));
    }

    @Test
    void trimLeft() {
        assertEquals("hello", new StringMethods().trim("   hello"));
    }

    @Test
    void trimRight() {
        assertEquals("hello", new StringMethods().trim("hello    "));
    }

    @Test
    void trimBoth() {
        assertEquals("hello", new StringMethods().trim("     hello    "));
    }

    @Test
    void trimEmpty() {
        assertEquals("", new StringMethods().trim(""));
    }

    @Test
    void trimBlank() {
        assertEquals("", new StringMethods().trim("        "));
    }
}