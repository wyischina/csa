package com.wyischina.tictactoe;

import java.util.Random;

public class Player {
    Board board = new Board();

    String[][] strings = new String[3][3];

    void playerInput(String s) {
        for (int i = 0; i < strings.length; i++) {
            int num = 1;
            if (i == 0) {
                for (int x = 0; x < strings.length; x++) {
                    strings[i][x] = "A" + num;
                    num++;
                }
            }
            if (i == 1) {
                for (int x = 0; x < strings.length; x++) {
                    strings[i][x] = "B" + num;
                    num++;
                }
            }
            if (i == 2) {
                for (int x = 0; x < strings.length; x++) {
                    strings[i][x] = "C" + num;
                    num++;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i][j].equals(s)) {
                    board.makeChange(i, j, "O ");
                }
            }
        }
    }

    void computerInput() {
        Random random = new Random();
        int r = random.nextInt(3);
        int u = random.nextInt(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == r && j == u) {
                    board.makeChange(r, u, "X ");
                }
            }
        }
    }
}
