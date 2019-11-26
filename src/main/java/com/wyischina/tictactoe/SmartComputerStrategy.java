package com.wyischina.tictactoe;

import java.util.Random;

public class SmartComputerStrategy implements Strategy {
    private Random rand = new Random();

    @Override
    public Move getNextMove(Board board) {
        String[][] gameBoard = board.getGameBoard();
        // put in the middle if takes first move.

        // defend if necessary.
        for (int i = 0; i < gameBoard.length; i++) {
            getRow(i, gameBoard);
        }

        // otherwise attack.
        return new Move(rand.nextInt(3), rand.nextInt(3));
    }

    private String[] getRow(int n, String[][] gameBoard) {
        return gameBoard[n];
    }

    private String[] getCol(int n, String[][] gameBoard) {
        String[] col = new String[3];
        for (int i = 0; i < gameBoard.length; i++) {
            col[i] = gameBoard[i][n];
        }
        return col;
    }

    private String[] getFirstDiagonal(String[][] gameBoard) {
        String[] diagonal = new String[3];
        int j = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            if (i == j) {
                diagonal[i] = gameBoard[i][j];
                j++;
            }
        }
        return diagonal;
    }

    private String[] getSecondDiagonal(String[][] gameBoard) {
        String[] diagonal = new String[3];
        int j = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            if (j == 2 - i) {
                diagonal[j] = gameBoard[i][j];
                j++;
            }
        }
        return diagonal;
    }
}