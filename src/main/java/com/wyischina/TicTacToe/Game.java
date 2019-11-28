package com.wyischina.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public String[][] board;
    public String turn = "";
    private String move  = "";
    public int totalMoves;
    public int markerNumX;
    public int markerNumO;
    public String winner = "";
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String[] tempArray;
    private Random r = new Random();
    private Scanner s = new Scanner(System.in);

    //setting dimensions for the board
    public void setBoardDimension(String userInput){
        int rowNum = Integer.parseInt(userInput.substring(0,1));
        int colNum = Integer.parseInt(userInput.substring(2,3));

        this.board = new String[rowNum][colNum];
    }

    //filling the board
    public void fillBoard(){
        String square = "□ ";
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = square;
            }
        }
    }

    //printing out the board
    public void printBoard(){
        int row = 1;

        System.out.print("  ");
        for(int l = 1; l < board.length + 1; l++){
            System.out.print(alphabet.substring(l-1,l));
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("--");
        for(int k = 0; k < board.length * 2; k++){
            System.out.print("-");
        }
        System.out.println();

        for(int i = 0; i < board.length; i++){
            System.out.print(row + " ");
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
            }
            row++;
            System.out.println();
        }
        System.out.println();
    }

    //getting player input
    public void playersTurn(){
        System.out.println("What is your next move?");
        this.move = s.nextLine();
    }

    //getting column number
    public int getColNum(String playerInput){
        int colNum = 0;
        for(int i = 1; i < board.length+1; i ++){
            if(alphabet.substring(i-1, i).equals(playerInput)){
                colNum = i;
                break;
            }
        }
        return colNum;
    }

    //getting the position of user input
    public void setPlayerMark(){
        while(true){
            playersTurn();
            int colNum = 0;
            int row = Integer.parseInt(move.substring(1,2));
            String col = move.toUpperCase().substring(0,1);

            if(board[row-1][getColNum(col)-1].equals("□ ")){
                board[row - 1][getColNum(col)-1] = "O ";
                totalMoves++;
                break;
            } else{
                System.out.println("Cell is full. Please enter a different position...");
            }
        }
    }

    //computers turn
    public void computersTurn(){
        System.out.println("Computer's move...");
        while(true){
            int ranCol = r.nextInt(board.length);
            int ranRow = r.nextInt(board.length);
            if(board[ranCol][ranRow].equals("□ ")){
                board[ranCol][ranRow] = "X ";
                totalMoves++;
                break;
            }
        }
        System.out.println();
    }

    //deciding randomly whose turn it is
    public void whoseTurn(){
        int random = r.nextInt(2);
        if(random % 2 == 0){
            turn = "Player";
        } else{
            turn = "Computer";
        }
    }

    //checking if board is full
    public boolean boardFull(){
        return totalMoves == (board.length * board.length);
    }

    //getting row
    public String[] gettingRow(int n){
        return board[n];
    }

    //checking single row for winning row
    public boolean winningRow(){
        for(int i = 0; i < board.length; i++){
            this.markerNumO = 0;
            this.markerNumX = 0;
            this.tempArray = gettingRow(i);
            for(int j = 0; j < tempArray.length; j++){
                if(tempArray[j].equals("X ")){
                    this.markerNumX++;
                }
                if(tempArray[j].equals("O ")){
                    this.markerNumO++;
                }
            }
            if(this.markerNumO == this.tempArray.length){
                winner = "Player";
                return true;
            }else if(this.markerNumX == this.tempArray.length){
                winner = "Computer";
                return true;
            }
        }
        return false;
    }

    //getting column
    public String[] gettingCol(int n){
        String[] colArray = new String[board.length];
        for(int i = 0; i < board.length; i++){
            colArray[i] = board[i][n];
        }
        return colArray;
    }

    //checking columns for win
    public boolean winningColumn(){
        for(int j = 0; j < board.length; j++){
            this.markerNumX = 0;
            this.markerNumO = 0;
            String[] tempArray = gettingCol(j);
            for(int i = 0; i < tempArray.length; i++){
                if(tempArray[i].equals("X ")){
                    this.markerNumX++;
                }
                if(tempArray[i].equals("O ")){
                    this.markerNumO++;
                }
            }
            if(this.markerNumO == this.tempArray.length){
                winner = "Player";
                return true;
            }else if(this.markerNumX == this.tempArray.length){
                winner = "Computer";
                return true;
            }
        }
        return false;
    }

    //getting diagonal
    public String[] gettingDiagonalOne(){
        int index = 0;
        String[] diagonalArray = new String[board.length];
        for(int i = 0; i < board.length; i++){
            diagonalArray[i] = board[i][i];
        }
        return diagonalArray;
    }

    //checking for winning diagonal
    public boolean winningDiagonalOne(){
        this.markerNumX = 0;
        this.markerNumO = 0;
        String[] tempArray = gettingDiagonalOne();
        for(int i = 0; i < tempArray.length; i ++){
            if(tempArray[i].equals("X ")){
                this.markerNumX++;
            }
            if(tempArray[i].equals("O ")){
                this.markerNumO++;
            }
        }
        if(this.markerNumO == this.tempArray.length){
            winner = "Player";
            return true;
        }else if(this.markerNumX == this.tempArray.length){
            winner = "Computer";
            return true;
        }
        return false;
    }

    //checking for winning diagonal two
    public boolean winningDiagonalTwo(){
        this.markerNumO = 0;
        this.markerNumX = 0;
        for (int i = 0; i < board.length; i++){
            if(board[i][board.length-i-1].equals("X ")){
                this.markerNumX++;
            }
            if(board[i][board.length-i-1].equals("O ")){
                this.markerNumO++;
            }
        }
        if(this.markerNumO == board.length){
            winner = "Player";
            return true;
        }else if(this.markerNumX == board.length){
            winner = "Computer";
            return true;
        }
        return false;
    }
}