package com.wyischina.flow;

import java.util.Scanner;

public class StarPrinting {

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
            do {
                System.out.print("* ");
                x++;
            } while (x <= cols);
            System.out.println("");
            y++;
        } while (y <= rows);
    }

}
