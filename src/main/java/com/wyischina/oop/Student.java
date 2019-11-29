package com.wyischina.oop;

public class Student extends Human {

    private String name;

    public Student() {
        super(0, null);
    }

    public void grow() {
        System.out.println("grow() in Student");
    }

    public void play() {
        System.out.println("play()");
    }

}
