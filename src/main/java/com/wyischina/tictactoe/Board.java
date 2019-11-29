package com.wyischina.tictactoe;

public class Board {

    String[][] board = new String[3][3];

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

    void makeChange(int x, int y, String symbol) {
        if (board[x][y].equals("□ ")) {
            board[x][y] = symbol;
        } else if (board[x][y].equals("O ")) {
            printBoard();
        } else if (board[x][y].equals("X ")) {
            printBoard();
        }
    }
}