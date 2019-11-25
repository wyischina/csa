package com.wyischina.tictactoe;

import com.wyischina.oop.Human;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TacTacToe {

    public static void main(String[] args) {
        Player[] players = new Player[]{
                new HumanPlayer("You", "X"), new ComputerPlayer("Computer", "O")
        };
        int boardSize = 3;
        while(true) {
            Board board = new Board(boardSize);
            board.print();
            int maximumTurns = (boardSize * boardSize);
            int seed = new Random().nextInt(2);
            for(int turns = 0; turns < (boardSize * boardSize); turns++) {
                Player player = players[(seed + turns) % 2];
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
                } else if (turns == maximumTurns - 1) {
                    System.out.println("It's a tie");
                    break;
                }
            }
            System.out.println("Would you like to have another game? (y/n)");
            Scanner scanner = new Scanner(System.in);
            try {
                if (scanner.next().equals("y")) {
                    continue;
                }
                throw new IllegalArgumentException();
            } catch (Exception e) {
                System.out.println("Good bye");
                break;
            }
        }
    }

}
