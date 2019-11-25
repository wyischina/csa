package com.wyischina.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

    /**
     * Returns a list that contains all the even numbers in the given list of integers.
     * You must not change the input list. You must return a new List.
     *
     * @param integers list of integers
     * @return List contains all the even numbers in integers.
     */
    public List<Integer> findAllEvenNumbers(List<Integer> integers) {
        List<Integer> results = new ArrayList<>();
        for(int item : integers) {
            if (item % 2 == 0) {
                results.add(item);
            }
        }
        return results;
    }

    /**
     * Returns a list where all the items in the list is shifted one position to the left.
     * You must not change the input list. You must return a new List.
     *
     * e.g.
     * shiftLeft([1,2,3,4]) => [2,3,4,1]
     * shiftLeft(["h", "e", "l", "l", "o"]) => ["e", "l", "l", "o", "h"]
     *
     * @param objects list of objects.
     * @return List contains all the items in objects shifted to the left by one position.
     */
    public List shiftLeft1(List objects) {
        List results = new ArrayList();
        Iterator iterator = objects.iterator();
        if (!iterator.hasNext()) {
            return results;
        }
        Object firstItem = iterator.next();
        while(iterator.hasNext()) {
            results.add(iterator.next());
        }
        results.add(firstItem);
        return results;
    }

    /**
     * Returns a list where all the items in the list is shifted n positions to the left.
     * You must not change the input list. You must return a new List.
     *
     * e.g.
     * shiftLeft([1,2,3,4], 1) => [2,3,4,1]
     * shiftLeft([1,2,3,4], 2) => [3,4,1,2]
     * shiftLeft([1,2,3,4], 3) => [4,1,2,3]
     * shiftLeft([1,2,3,4], 4) => [1,2,3,4]
     *
     * @param objects list of objects.
     * @return List contains all the items in objects shifted to the left by one position.
     */
    public List shiftLeftN(List objects, int n) {
        for(int i = 0; i < n; i++) {
            objects = shiftLeft1(objects);
        }
        return objects;
    }

    /**
     *
     * Return a list that contains the exact same numbers as the given array, but rearranged
     * so that all the even numbers come before all the odd numbers. Other than that, the numbers
     * can be in any order. You must not change the input list. You must return a new List.
     *
     * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
     * evenOdd([3, 3, 2]) → [2, 3, 3]
     * evenOdd([2, 2, 2]) → [2, 2, 2]
     *
     * @param integers list of integers.
     * @return Return a list that contains the exact same numbers as the given array, but rearranged so
     * that all the even numbers come before all the odd numbers.
     */
    public List evenOdd(List<Integer> integers) {
        List results = findAllEvenNumbers(integers);
        for(int item : integers) {
            if (item % 2 != 0) {
                results.add(item);
            }
        }
        return results;
    }

}
