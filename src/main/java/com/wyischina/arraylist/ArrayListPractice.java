package com.wyischina.arraylist;

import java.util.ArrayList;
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
        List<Integer> evenNumbers = new ArrayList<>();
        if(integers.isEmpty()){
            return integers;
        }
        for(int v:integers){
            if(v%2==0){
                evenNumbers.add(v);
            }
        }
        return evenNumbers;
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
        List leftShifted = new ArrayList();
        if(objects.isEmpty()){
            return leftShifted;
        }
        for(int i = 1; i < objects.size(); i++){
            leftShifted.add(objects.get(i));
        }
        leftShifted.add(objects.get(0));
        return leftShifted;
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
        List shiftLeftN = new ArrayList();
        if(objects.isEmpty()){
            return shiftLeftN;
        }
        for(int i = n; i < objects.size(); i++){
            shiftLeftN.add(objects.get(i));
        }
        for (int i = 0; i < n; i++) {
            shiftLeftN.add(objects.get(i));
        }
        return shiftLeftN;
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
        List evenOdd = new ArrayList();
        if(integers.isEmpty()){
            return evenOdd;
        }
        for(int i:integers){
            if(i%2 == 0){
                evenOdd.add(i);
            }
        }
        for(int i:integers){
            if(i%2 == 1){
                evenOdd.add(i);
            }
        }
        return evenOdd;
    }

}
