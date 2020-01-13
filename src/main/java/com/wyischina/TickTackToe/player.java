package com.wyischina.TickTackToe;

public class player {
    userEnter position = new userEnter();
    int A = 0;
    int B = 0;
    int C = 0;
    int one = 0;
    int two = 0;
    int three = 0;
    int counter = 0;
    int leftcounter = 0;
    int rightcounter = 0;
    boolean won = false;

    public String userEntered(String c) {
        position.convert(c);
        //this.positions = addArray(this.positions);
        //this.positions[positions.length] = position;
        //table[position.character()-1][position.number-1] = "O";
            if (position.character() == 1) {
                A++;
            } else if (position.character() == 2) {
                B++;
            } else if (position.character() == 3) {
                C++;
            }
            if (position.number() == 1) {
                one++;
            } else if (position.number() == 2) {
                two++;
            } else if (position.number() == 3) {
                three++;
            }
            if (position.number == 1 && position.character() == 1) {
                leftcounter++;
            } else if (position.number == 2 && position.character() == 2) {
                counter++;
            } else if (position.number == 3 && position.character() == 3) {
                leftcounter++;
            } else if (position.number == 1 && position.character() == 3) {
                rightcounter++;
            } else if (position.number == 3 && position.character() == 1) {
                rightcounter++;
            }

        //calculating any achieved winning patterns
        if (rightcounter == 2 && counter == 1) {
            won = true;
            return "user won";
        } else if (leftcounter == 2 && counter == 1) {
            won = true;
            return "user won";
        } else if (A == 3 || B == 3 || C == 3 || one == 3 || two == 3 || three == 3) {
            won = true;
            return "user won";
        } else {
            return "";
        }
    }
    // return value of boolean to see if user won
    public boolean won(){
        return won;
    }
}