package com.wyischina.flow;

public class PracticeB3 {

    public static void main(String[] args) {
        int y = 1;
        int rows = 9;
        do {
            int x = 1;
            int cols;
            if (y <= 5) {
                cols = y;
            } else {
                cols = 10 - y;
            }
            if (cols % 2 == 0) {
                cols = cols * 2;
            }
            do {
                System.out.print("* ");
                x++;
            } while (x <= cols);
            System.out.println("");
            y++;
        } while (y <= rows);
    }

}
