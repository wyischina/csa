package com.wyischina.tictactoe;

import java.util.Random;

public class Player {
    Board board;

    String[][] strings = new String[3][3];

    public Player(Board board) {
        this.board = board;
    }

    //asserts value based on the input
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

    //assert value randomly
    void computerInput() {
        Random random = new Random();
        int r = random.nextInt(3);
        int u = random.nextInt(3);
        board.makeChange(r, u, "X ");
    }
}