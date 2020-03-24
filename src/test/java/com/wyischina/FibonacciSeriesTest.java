package com.wyischina;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {

    @Test
    public void testFib0() {
        assertEquals(0, FibonacciSeries.fib(0));
    }


    @Test
    public void testFib1() {
        assertEquals(1, FibonacciSeries.fib(1));
    }


    @Test
    public void testFibFirstTen() {
        List<Integer> ns = List.of(0,1,1,2,3,5,8,13,21,34,55,89,144);
        for (int i = 0; i < ns.size(); i++) {
             assertEquals(ns.get(i), FibonacciSeries.fib(i) ,i +"th number is wrong");
        }
    }
}