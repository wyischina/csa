package com.wyischina.oop;

public class OOPDemonstration {

    public static void main(String[] args) {
        Human john = new Human(18, "john smith");
        Student william = new Student();

        john.age = 15;
        john.eat();

        william.age = 12;
        william.name = "Will Smith";
        william.eat();
        william.grow();
        william.play();
    }

}
