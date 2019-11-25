package com.wyischina.tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Player {
    /**
     * Create a new Player.
     *
     * @param symbol
     */
    public HumanPlayer(String name, String symbol) {
        super(name, symbol);
    }

    @Override
    public Move getNextMove(Board board) {
        Move move = null;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your next move:");
            String input = scanner.next();
            int column = "ABC".indexOf(input.substring(0, 1).toUpperCase());
            int row = Integer.parseInt(input.substring(1, 2)) - 1;
            move = new Move(column, row);
            if (board.isValidMove(move)) {
                break;
            }
            board.print();
        }
        return move;
    }
}
