package com.wyischina.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    String[][] board = new String[3][3];

    public static void main(String[] args) {
        Player player = new Player();
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        TicTacToe ttt = new TicTacToe();

        while (true) {
            board.printBoard();
            String input = scanner.nextLine();
            player.playerInput(input);
            player.computerInput();
        }
    }
}