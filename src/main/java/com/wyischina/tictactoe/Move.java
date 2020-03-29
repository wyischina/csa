package com.wyischina.tictactoe;

public class Move {

    int row;
    int col;

    public Move(int row, int col){
        this.row = row;
        this.col = col;
    }

    /**
     * parses the cell position from string format to int
     * @param string alphabet + number
     * @throws InvalidCellException
     */
    public Move(String string) throws InvalidCellException{
        int row = "123".indexOf(string.substring(1,2));
        int column = "ABC".indexOf(string.substring(0,1).toUpperCase());

        if(row == -1 || column == -1){
            throw new InvalidCellException();
        }

        this.row = row;
        this.col = column;
    }
}
