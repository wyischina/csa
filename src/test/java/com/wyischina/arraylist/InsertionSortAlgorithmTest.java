package com.wyischina.arraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortAlgorithmTest {


    @Test
    public void testSortWithNoItems() {
        List<Integer> results = new InsertionSortAlgorithm().sort(new ArrayList());
        assertEquals(Collections.emptyList(), results);
    }

    @Test
    public void testSort() {
        List<Integer> integers = RandomUtilities.getRandomIntegers();
        List<Integer> results = new InsertionSortAlgorithm().sort(new ArrayList(integers));
        Collections.sort(integers);
        assertEquals(integers, results);
    }

}
