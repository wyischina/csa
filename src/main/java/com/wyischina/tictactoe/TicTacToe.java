package com.wyischina.tictactoe;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    String[][] board = new String[3][3];

    public static void main(String[] args) {
        Random random = new Random();
        Board board = new Board();
        Player player = new Player(board);
        Scanner scanner = new Scanner(System.in);
        int start = random.nextInt(2);

        boolean restart = true;


        while (restart) {
            board.printBoard();
            //randomly choose who to start
            if (start == 1) {
                while (!board.check()) {
                    System.out.println("What is your next move?");
                    System.out.print("> ");
                    String input = scanner.nextLine();
                    player.playerInput(input);
                    player.computerInput();
                    if (board.check()) {
                        if (board.lose()) {
                            System.out.println("Computer Win");
                        } else if (board.win()) {
                            System.out.println("User Win");
                        }
                        break;
                    }
                }
                System.out.println("Do you want to restart? Type in yes or no");
                String r = scanner.nextLine();
                if (r.equals("no")) {
                    System.out.println("Game Over");
                    restart = false;
                } else if (r.equals("yes")) {
                    board.reset();
                }
            } else if (start == 0) {
                while (!board.check()) {
                    player.computerInput();
                    System.out.println("What is your next move?");
                    System.out.print("> ");
                    String input = scanner.nextLine();
                    player.playerInput(input);
                    if (board.check()) {
                        if (board.lose()) {
                            System.out.println("Computer Win");
                        } else if (board.win()) {
                            System.out.println("User Win");
                        }
                        break;
                    }
                }
                System.out.println("Do you want to restart? Type in yes or no");
                String r = scanner.nextLine();
                if (r.equals("no")) {
                    System.out.println("Game Over");
                    restart = false;
                } else if (r.equals("yes")) {
                    board.reset();
                }
            }
        }
    }
}