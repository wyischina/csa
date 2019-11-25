package com.wyischina.tictactoe;

import com.wyischina.oop.Human;

import java.util.Scanner;

public class TacTacToe {

    public static void main(String[] args) {
        Player[] players = new Player[]{
                new HumanPlayer("You", "X"), new ComputerPlayer("Computer", "O")
        };
        Board board = new Board(3);
        board.print();
        for(int turns = 0; turns < 9; turns++) {
            Player player = players[turns % 2];
            Move move = null;
            do {
                move = player.getNextMove(board);
            } while(!board.isValidMove(move));
            board.setCell(move.column, move.row, player.getSymbol());
            System.out.println(player.getName() + " has made the move " + move);
            board.print();
            System.out.println();
            if (board.hasWon()) {
                System.out.println(player.getName() + " won!");
                break;
            }
        }
    }

}
