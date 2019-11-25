package com.wyischina.arraylist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListPracticeTest {


    @Test
    public void testFindAllEvenNumbersWithEmptyList() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Collections.emptyList(), practice.findAllEvenNumbers(Collections.emptyList()));
    }

    @Test
    public void testFindAllEvenNumbersWithOneItemZero() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Collections.singletonList(0), practice.findAllEvenNumbers(Collections.singletonList(0)));
    }

    @Test
    public void testFindAllEvenNumbersWithSingleEven() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Collections.singletonList(2), practice.findAllEvenNumbers(Collections.singletonList(2)));
    }

    @Test
    public void testFindAllEvenNumbersWithSingleOdd() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Collections.emptyList(), practice.findAllEvenNumbers(Collections.singletonList(1)));
    }

    @Test
    public void testFindAllEvenNumbersWithAllOdds() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Collections.EMPTY_LIST, practice.findAllEvenNumbers(Arrays.asList(3, 5, 7)));
    }

    @Test
    public void testFindAllEvenNumbersWithAllEvens() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Arrays.asList(2,4,6), practice.findAllEvenNumbers(Arrays.asList(2,4,6)));
    }

    @Test
    public void testFindAllEvenNumbersWithMixedEvenOdds() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Arrays.asList(2,4,6), practice.findAllEvenNumbers(Arrays.asList(1,3,5,2,4,6)));
    }

    @Test
    public void testShiftLeftEmpty() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Collections.emptyList(), practice.shiftLeft1(Collections.emptyList()));
    }

    @Test
    public void testShiftLeftSingle() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Collections.singletonList(1), practice.shiftLeft1(Collections.singletonList(1)));
    }

    @Test
    public void testShiftLeftMultiple() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Arrays.asList(2,3,4,1), practice.shiftLeft1(Arrays.asList(1,2,3,4)));
    }

    @Test
    public void testShiftLeftNMultiple1() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Arrays.asList(2,3,4,1), practice.shiftLeftN(Arrays.asList(1,2,3,4), 1));
    }

    @Test
    public void testShiftLeftNMultiple2() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Arrays.asList(3,4,1,2), practice.shiftLeftN(Arrays.asList(1,2,3,4), 2));
    }

    @Test
    public void testShiftLeftNMultipleRandomNumbers() {
        ArrayListPractice practice = new ArrayListPractice();
        List<Integer> randomNumbers = RandomUtilities.getRandomIntegers();
        assertEquals(randomNumbers, practice.shiftLeftN(randomNumbers, randomNumbers.size()));
    }

    @Test
    public void testEvenOdd() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Arrays.asList(2,4,1,3), practice.evenOdd(Arrays.asList(1,2,3,4)));
    }

    @Test
    public void testEvenOddEvenOnly() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Arrays.asList(2,4,6,8), practice.evenOdd(Arrays.asList(2,4,6,8)));
    }

    @Test
    public void testEvenOddOddOnly() {
        ArrayListPractice practice = new ArrayListPractice();
        assertEquals(Arrays.asList(1,3,5,7), practice.evenOdd(Arrays.asList(1,3,5,7)));
    }
}
