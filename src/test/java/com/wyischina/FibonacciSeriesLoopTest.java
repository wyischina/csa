package com.wyischina;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSeriesLoopTest {

    @Test
    public void testFib0() {
        assertEquals(0, FibonacciSeriesLoop.fib(0));
    }


    @Test
    public void testFib1() {
        assertEquals(1, FibonacciSeriesLoop.fib(1));
    }


    @Test
    public void testFibFirstTen() {
        List<Integer> ns = List.of(0,1,1,2,3,5,8,13,21,34,55,89,144);
        for (int i = 0; i < ns.size(); i++) {
            assertEquals(ns.get(i), FibonacciSeriesLoop.fib(i) ,i +"th number is wrong");
        }
    }
}