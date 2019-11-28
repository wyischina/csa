package com.wyischina.tictactoe;

public class Player {

    protected Board board;

    String[][] strings = new String[3][3];

    public Player(Board board) {
        this.board = board;
    }

    public boolean playerInput(String s) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i][j].equals(s)) {
                    boolean successful = board.makeChange(i, j, "O ");
                    if (!successful) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
