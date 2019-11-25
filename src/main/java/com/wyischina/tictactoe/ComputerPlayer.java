package com.wyischina.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class ComputerPlayer extends Player {
    /**
     * Create a new Player.
     *
     * @param symbol
     */
    public ComputerPlayer(String name, String symbol) {
        super(name, symbol);
    }

    @Override
    public Move getNextMove(Board board) {
        Random random = new Random();
        Move move = null;
        do {
            int column = random.nextInt(3);
            int row = random.nextInt(3);
            move = new Move(board.boardSize, column, row);
        } while (!board.isValidMove(move));
        return move;
    }
}
