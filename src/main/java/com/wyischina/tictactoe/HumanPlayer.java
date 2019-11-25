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
            String input;
            try {
                input = scanner.next();
            } catch (Exception e) {
                System.out.println("Your input is invalid.");
                continue;
            }
            if (input.length() < 2) {
                System.out.println("Your move must be no less than 2 characters.");
                continue;
            }
            int column = Move.getColumnHeaders(board.boardSize).indexOf(input.substring(0, 1).toUpperCase());
            if (column < 0) {
                System.out.println("The column must be one of A, B and C");
                continue;
            }
            int row;
            try {
                row = Integer.parseInt(input.substring(1)) - 1;
                if (row < 0 || row > (board.getSize() - 1)) {
                    System.out.println("Please enter a row number from 1 to " + board.getSize());
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid row number");
                continue;
            }
            move = new Move(board.boardSize, column, row);
            if (board.isValidMove(move)) {
                break;
            } else {
                System.out.println("The move '" + move + "' has already been chosen.");
            }
            board.print();
        }
        return move;
    }
}
