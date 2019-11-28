package com.wyischina.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Board display = new Board();
        Player player = new Player(display);
        Computer computer = new Computer(display);
        Scanner scanner = new Scanner(System.in);
        display.printBoard();


        while (true) {
            boolean successful;
            do {
                String input = scanner.nextLine();
                successful = player.playerInput(input);
                if (!successful) {
                    System.out.println("Please enter a valid input");
                }
            } while(!successful);

            computer.computerInput();
        }
    }
}