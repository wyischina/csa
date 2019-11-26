package com.wyischina.tictactoe;

import java.util.Arrays;

public class Board {

    private String[][] gameBoard;

    public Board() {
        this.gameBoard = new String[][]{
                {"□", "□", "□"},
                {"□", "□", "□"},
                {"□", "□", "□"},
        };
    }

    public void appendBoard(Move move, String symbol) throws CellOccupiedException{
        if(this.gameBoard[move.row][move.col].equals("□")){
            this.gameBoard[move.row][move.col] = symbol;
        } else {
            throw new CellOccupiedException();
        }
    }

    public void print(){
        System.out.println("  A B C");
        System.out.println("--------");
        int row = 1;
        for (int i = 0; i < this.gameBoard.length; i++) {
            System.out.print(row + " ");
            row++;
            for (int j = 0; j < this.gameBoard[i].length; j++) {
                System.out.print(this.gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private String[] getRow(int n){
        return gameBoard[n];
    }

    private String[] getCol(int n){
        String[] col = new String[3];
        for (int i = 0; i < gameBoard.length; i++) {
                col[i] = gameBoard[i][n];
        }
        return col;
    }

    private String[] getFirstDiagonal(){
        String[] diagonal = new String[3];
        int j = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            if(i == j){
                    diagonal[i] = gameBoard[i][j];
                    j++;
            }
        }
        return diagonal;
    }

    private String[] getSecondDiagonal(){
        String[] diagonal = new String[3];
        int j = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            if(j == 2-i){
                diagonal[j] = gameBoard[i][j];
                j++;
            }
        }
        return diagonal;
    }

    private boolean checkForWin(String[] s){
        return !s[0].equals("□") && s[0].equals(s[1]) && s[1].equals(s[2]);
    }

    private String classifyWinner(String[] s){
        return s[0];
    }

    public String getWinnerSymbol() {
        String[] firstDiagonal = getFirstDiagonal();
        String[] secondDiagonal = getSecondDiagonal();

        if (checkForWin(firstDiagonal)) {
            return classifyWinner(firstDiagonal);
        } else if (checkForWin(secondDiagonal)) {
            return classifyWinner(secondDiagonal);
        } else {
            for (int i = 0; i < gameBoard.length; i++) {
                String[] cols = getCol(i);
                String[] rows = getRow(i);
                if (checkForWin(cols)) {
                    return classifyWinner(cols);
                } else if (checkForWin(rows)) {
                    return classifyWinner(rows);
                }
            }
        }
        return null;
    }

    public boolean isFilled(){
        for (String[] strings : gameBoard) {
            for (String s: strings) {
                if (s.equals("□")){
                    return false;
                }
            }
        }
        return true;
    }

    public String[][] getGameBoard (){
        return gameBoard;
    }
}
