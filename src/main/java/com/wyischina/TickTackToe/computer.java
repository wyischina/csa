package com.wyischina.TickTackToe;

public class computer {
    int A = 0;
    int B = 0;
    int C = 0;
    int one = 0;
    int two = 0;
    int three = 0;
    int counter = 0;
    int leftcounter = 0;
    int rightcounter = 0;
    boolean comwon = false;

    public String comEntered(int x, int y) {
        if (x == 0) {
            A++;
        } else if (x == 1) {
            B++;
        } else if (x == 2) {
            C++;
        }
        if (y == 0) {
            one++;
        } else if (y == 1) {
            two++;
        } else if (y == 2) {
            three++;
        }
        if (y == 0 && x == 0) {
            leftcounter++;
        } else if (y == 1 && x == 1) {
            counter++;
        } else if (y == 2 && x == 2) {
            leftcounter++;
        } else if (y == 0 && x == 2) {
            rightcounter++;
        } else if (y == 2 && x == 0) {
            rightcounter++;
        }

        //calculating any achieved winning patterns
        if (rightcounter == 2 && counter == 1) {
            comwon = true;
            return "computer won";
        } else if (leftcounter == 2 && counter == 1) {
            comwon = true;
            return "computer won";
        } else if (A == 3 || B == 3 || C == 3 || one == 3 || two == 3 || three == 3) {
            comwon = true;
            return "computer won";
        } else {
            return "";
        }
    }
    // return value of boolean to see if computer won
    public boolean won(){
        return comwon;
    }
}
