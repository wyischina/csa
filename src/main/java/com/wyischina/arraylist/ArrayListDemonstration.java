package com.wyischina.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemonstration {

    public static void main(String[] args) {
        List cars = new ArrayList();
        Iterator iterator = cars.iterator();
        while(iterator.hasNext()) {
            Object item = iterator.next();
            System.out.println(item);
        }
    }

}
