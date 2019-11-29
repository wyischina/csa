package com.wyischina.arraylist;

import com.wyischina.oop.LazyStudent;
import com.wyischina.oop.Student;

import java.util.*;

public class ArrayListDemonstration {

    public static void main(String[] args) {
        List<Integer> input = List.of(-4,2,6,1,8,0);
        List output = new ArrayListDemonstration().selectionSort(input);
        System.out.println(output);
    }


    public List<Integer> selectionSort(List<Integer> input) {
        List<Integer> remaining = new ArrayList<Integer>(input);
        List<Integer> output = new ArrayList<Integer>();
        for(int i = 0; i < input.size(); i++) {
            int smallestIndex = 0;
            for (int j = 1; j < remaining.size(); j++) {
                if (remaining.get(j) < remaining.get(smallestIndex)) {
                    smallestIndex = j;
                }
            }
            output.add(remaining.get(smallestIndex));
            remaining.remove(smallestIndex);
        }
        return output;
    }



    public static List selectSomething(List input) {
        List output = new ArrayList();
        for(int i = 0; i < input.size(); i++) {
            Object item = input.get(i);
            if (((int) item) % 2 == 0) {
                output.add(item);
            }
        }
        return output;
    }

}
