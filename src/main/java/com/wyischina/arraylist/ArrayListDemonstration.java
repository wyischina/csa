package com.wyischina.arraylist;

import com.wyischina.oop.LazyStudent;
import com.wyischina.oop.Student;

import java.util.*;

public class ArrayListDemonstration {

    public static void main(String[] args) {
        List<Integer> input = List.of(0,4,2,6,1,8);
        List output = new ArrayListDemonstration().selectionSort(input);
        System.out.println(output);
    }


    public List<Integer> selectionSort(List<Integer> input) {
        List<Integer> output = new ArrayList<Integer>(input);
        for(int i = 0; i < input.size(); i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < output.size(); j++) {
                if (output.get(j) < output.get(smallestIndex)) {
                    smallestIndex = j;
                }
            }
            int ithValue = output.get(i);
            output.set(i, output.get(smallestIndex));
            output.set(smallestIndex, ithValue);
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
