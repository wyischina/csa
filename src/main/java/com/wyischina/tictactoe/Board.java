package com.wyischina.tictactoe;

import java.util.Random;

public class Board {

    String[][] cells = new String[3][3];
    int boardSize;
    private static final String EMPTY_CELL = "□";

    /**
     * Create a new board
     */
    public Board(int boardSize) {
        assert boardSize <= 26 && boardSize > 1;
        this.boardSize = boardSize;
    }

    /**
     * Get the board size.
     * @return int the board size
     */
    public int getSize() {
        return this.boardSize;
    }

    /**
     * Set the cell of the board to the given symbol
     * @param column of the cell
     * @param row of the cell
     * @param symbol the symbol
     */
    public void setCell(int column, int row, String symbol) {
        cells[row][column] = symbol;
    }

    /**
     * Print the board.
     */
    public void print() {
        System.out.println("  A B C");
        System.out.println("--------");
        for (int i = 0; i < cells.length; i++) {
            System.out.print(i + 1);
            System.out.print(" ");
            for (int j = 0; j < cells[i].length; j++) {
                String cell = cells[i][j];
                System.out.print(cell == null ? EMPTY_CELL : cell);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(Move move) {
        String symbol = cells[move.row][move.column];
        return symbol == null;
    }

    /**
     * Is the board already in the winning state?
     * @return true if the board is in the winning state.
     */
    public boolean hasWon() {
        // rows win
        for (int i = 0; i < cells.length; i++) {
            if (isWinningCombination(cells[i])) {
                return true;
            }
        }
        // cols win
        String[][] transposed = transposedBoard();
        for (int i = 0; i < transposed.length; i++) {
            if (isWinningCombination(transposed[i])) {
                return true;
            }
        }
        // left diagonal
        if (isWinningCombination(getLeftDiagnonalCells())) {
            return true;
        }

        // right diagonal
        if (isWinningCombination(getRightDiagnonalCells())) {
            return true;
        }
        return false;
    }

    private String[][] transposedBoard() {
        String[][] transposedCells = new String[cells.length][cells.length];
        for (int i = 0; i < transposedCells.length; i++) {
            for (int j = 0; j < transposedCells[i].length; j++) {
                transposedCells[j][i] = cells[i][j];
            }
        }
        return transposedCells;
    }


    private String[] getLeftDiagnonalCells() {
        String[] diagonal = new String[cells.length];
        for (int i = 0; i < cells.length; i++) {
            diagonal[i] = cells[i][i];
        }
        return diagonal;
    }


    private String[] getRightDiagnonalCells() {
        String[] diagonal = new String[cells.length];
        for (int i = 0; i < cells.length; i++) {
            diagonal[i] = cells[i][cells.length - 1 - i];
        }
        return diagonal;
    }

    private boolean isWinningCombination(String[] threeCells) {
        assert threeCells.length == 3;
        String firstChar = threeCells[0];
        if (firstChar == null) {
            return false;
        }
        for(int i = 1; i < threeCells.length; i++) {
            if (threeCells[i] == null || !threeCells[i].equals(firstChar)) {
                return false;
            }
        }
        return true;
    }

}
