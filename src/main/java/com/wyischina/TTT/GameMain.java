package com.wyischina.TTT;

import java.awt.print.PrinterGraphics;
import java.util.Arrays;
import java.util.Scanner;

    public class GameMain {
        public static int row, col;
        public static Scanner userInput = new Scanner(System.in);
        public static char[][] board = new char[3][3];
        public static char turn = 'X';

        public static void main(String[] args) {
            for (int i = 0; i < board.length; i++){
                for (int j = 0; j < board[i].length; j++){
                    board[i][j] = '_';
                }
            }
            System.out.println();
            System.out.println("Welcome to John's Tic Tac Toe Game!");
            printBoard();
            play();
        }

        public static void play(){
            boolean playing = true;
            while (playing){
                System.out.println();
                System.out.println("It's " + turn + "'s turn: ");
               // String line = userInput.nextLine();
                row = userInput.nextInt() - 1;
                col = userInput.nextInt() - 1;
                //row = convertCoordinate(line.substring(0, 1));
               // col = Integer.parseInt(line.substring(1, 2));
                board[row][col] = turn;
                if (gameOver(row, col)) {
                    playing = false;
                    System.out.println("Game Over! " + turn + " wins!~");
                }
                printBoard();
                if (turn == 'X') {
                    turn = 'O';
                } else {
                    turn = 'X';
                }
            }
        }

       // private static int convertCoordinate(String input) {
       // }


        public static void printBoard(){
            int index = 0;
            for (int i = 0; i < board.length; i++){
                System.out.println();
                for (int j = 0; j < board[i].length; j++){
                    if (j == 0){
                        System.out.print("| ");
                    }
                    System.out.print(board[i][j] + " | ");
                }
            }
            System.out.println();
        }

        public static boolean gameOver(int rMove, int cMove){
            //check perpendicular
            if (board[0][cMove] == board[1][cMove] && board[0][cMove] == board [2][cMove])
                return true;
            if (board[rMove][0] == board[rMove][1] && board[rMove][0] == board [rMove][2])
                return true;
            //check diagonal
            if (board[0][0] == board[1][1] && board[0][0] == board [2][2] && board [1][1] != '_')
                return true;
            if (board[0][2] == board[1][1] && board[0][2] == board [2][0] && board[1][1] != '_')
                return true;
            return false;
        }
    }

