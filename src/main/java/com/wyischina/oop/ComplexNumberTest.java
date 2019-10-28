package com.wyischina.oop;

public class ComplexNumberTest {

    public static void main(String args[]){
        ComplexNumber test = new ComplexNumber(1,0);
        System.out.println(test.toString());
        System.out.println(test.getComplexNum());

        System.out.println("Adding..." + test.addComplexNum(1,1));
        System.out.println("Subtracting..." + test.subComplexNum(2,2));
        System.out.println("Multiplying..." + test.multComplexNum(2,-6));
    }
}
