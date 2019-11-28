package com.wyischina.tictactoe;

import java.util.Scanner;

import java.util.Random;

public class TicTacToe {
    String[][] strings = new String[3][3];

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


    void assignValue() {
        for (int i = 0; i < strings.length; i++) {
            int num = 1;
            if (i == 0) {
                for (int x = 0; x < strings.length; x++) {
                    strings[i][x] = "A" + num;
                    num++;
                }
            }
            if (i == 1) {
                for (int x = 0; x < strings.length; x++) {
                    strings[i][x] = "B" + num;
                    num++;
                }
            }
            if (i == 2) {
                for (int x = 0; x < strings.length; x++) {
                    strings[i][x] = "C" + num;
                    num++;
                }
            }
        }
    }
}