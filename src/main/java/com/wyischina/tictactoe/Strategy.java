package com.wyischina.tictactoe;

public interface Strategy {
    /**
     *
     * @return the move that the player want
     * @throws InvalidCellException
     */
    public Move getNextMove(Board board) throws InvalidCellException;
}
