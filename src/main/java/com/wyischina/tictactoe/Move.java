package com.wyischina.tictactoe;

public class Move {

    int column;
    int row;
    int boardSize;

    public Move(int boardSize, int column, int row) {
        this.boardSize = boardSize;
        this.column = column;
        this.row = row;
    }

    public static final String getColumnHeaders(int boardSize) {
        assert boardSize <= 26 : "only support board size < 26";
        String headers = "";
        char firstCharacter = 'A';
        for(char i = 0; i < boardSize; i++) {
            headers = headers + (new String(new char[]{(char) (firstCharacter + i)}));
        }
        return headers;
    }

    @Override
    public String toString() {
        return getColumnHeaders(boardSize).substring(column, column+1) + (this.row + 1);
    }
}
