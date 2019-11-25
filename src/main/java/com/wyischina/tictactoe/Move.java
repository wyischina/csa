package com.wyischina.tictactoe;

public class Move {

    int column;
    int row;

    public Move(int column, int row) {
        this.column = column;
        this.row = row;
    }

    @Override
    public String toString() {
        return "ABC".substring(column, column+1) + (this.row + 1);
    }
}
