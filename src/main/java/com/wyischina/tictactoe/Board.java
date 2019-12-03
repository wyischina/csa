package com.wyischina.tictactoe;

import java.util.Scanner;

public class Board {

    String[][] board = new String[3][3];
    Scanner scanner = new Scanner(System.in);

    //prints out the board
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
        System.out.println("");
    }

    //apply any changes to the board based on the input
    void makeChange(int x, int y, String symbol) {
        if (board[x][y] == null) {
            board[x][y] = symbol;
            printBoard();
        } else if (board[x][y] != null){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == null) {
                        board[i][j] = symbol;
                        break;
                    }
                }break;
            }
        }
    }

    //resets the game board in order to restart
    void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = null;
            }
        }
    }

    //user lose
    boolean lose() {
        // horizontal
        if (board[0][0] != null && board[0][0].equals("X ") && board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])) {
            return true;
        }
        // horizontal
        else if (board[1][0] != null && board[1][0].equals("X ") && board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])) {
            return true;
        }
        // horizontal
        else if (board[2][0] != null && board[2][0].equals("X ") && board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])) {
            return true;
        }
        // vertical
        else if (board[0][0] != null && board[0][0].equals("X ") && board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])) {
            return true;
        }
        // vertical
        else if (board[0][1] != null && board[0][1].equals("X ") && board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])) {
            return true;
        }
        // vertical
        else if (board[0][2] != null && board[0][2].equals("X ") && board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])) {
            return true;
        }
        // diagonal
        else if (board[0][0] != null && board[0][0].equals("X ") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        }
        // diagonal
        else if (board[0][2] != null && board[0][2].equals("X ") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }
        return false;
    }

    //check if the user wins
    boolean win() {
        if (board[0][0] != null && board[0][0].equals("O ") && board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])) {
            return true;
        }
        // horizontal
        else if (board[1][0] != null && board[1][0].equals("O ") && board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])) {
            return true;
        }
        // horizontal
        else if (board[2][0] != null && board[2][0].equals("O ") && board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])) {
            return true;
        }
        // vertical
        else if (board[0][0] != null && board[0][0].equals("O ") && board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])) {
            return true;
        }
        // vertical
        else if (board[0][1] != null && board[0][1].equals("O ") && board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])) {
            return true;
        }
        // vertical
        else if (board[0][2] != null && board[0][2].equals("O ") && board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])) {
            return true;
        }
        // diagonal
        else if (board[0][0] != null && board[0][0].equals("O ") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        }
        // diagonal
        else if (board[0][2] != null && board[0][2].equals("O ") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }
        return false;
    }

    //check if the game is done
    boolean check() {
        if (board[0][0]!= null && board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])) {
            return true;
        }
        // horizontal
        else if (board[1][0]!= null && board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])) {
            return true;
        }
        // horizontal
        else if (board[2][0]!= null && board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])) {
            return true;
        }
        // vertical
        else if (board[0][0]!= null && board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])) {
            return true;
        }
        // vertical
        else if (board[0][1]!= null && board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])) {
            return true;
        }
        // vertical
        else if (board[0][2]!= null  && board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])) {
            return true;
        }
        // diagonal
        else if (board[0][0]!= null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        }
        // diagonal
        else if (board[0][2]!= null  && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }
        return false;
    }
}