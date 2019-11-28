package com.wyischina.tictactoe;

import java.util.Random;

public class Computer extends Player {

    public Computer(Board board) {
        super(board);
    }

    public boolean computerInput() {
        Random random = new Random();

        int r = random.nextInt(3);
        int u = random.nextInt(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == r && j == u) {
                    boolean successful = board.makeChange(r, u,"X ");
                    if (!successful) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}