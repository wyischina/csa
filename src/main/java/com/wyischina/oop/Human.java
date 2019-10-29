package com.wyischina.oop;

import java.util.Date;

public class Human {

    int age;
    String name;

    public Human(Date birthday) {
        this.age = 0; /*. calculate from birthday .*/
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void grow() {
        System.out.println("grow() in Human");
    }

    public void eat() {
        System.out.println("eat()");
    }

}
