package com.wyischina.tictactoe;

class Board {
    String[][] board = new String[3][3];

    boolean makeChange(int x, int y, String symbol) {
        for (int i = 0; i < board.length; i++) {
            for (int e = 0; e < board.length; e++) {
                if (board[x][y].equals("□ ")) {
                    board[x][y] = symbol;
                    return true;
                } else if (board[x][y] == null) {
                    board[x][y] = symbol;
                    return true;
                }
            }
        }
        return false;
    }


    void printBoard() {
        System.out.println("  A B C");
        System.out.println("--------");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1 + " ");
            for (int x = 0; x < board.length; x++) {
                if (board[x][i] == null) {
                    System.out.print("□ ");
                } else {
                    System.out.print(board[x][i]);
                }
            }
            System.out.println("");
        }
        System.out.println("What is your next move?");
    }

}