package com.wyischina.tictactoe;

import java.util.Scanner;

public class Game {
    private Board gameBoard = new Board();
    private Human p1;
    private Computer p2;

    public Game(Player p1, Player p2){
        this.p1 = (Human)p1;
        this.p2 = (Computer)p2;
    }

    /**
     * print the game board
     */
    public void print(){
        gameBoard.print();
        System.out.println();
    }

    /**
     * the player makes a move
     * @param player user or computer
     */
    public void takeTurn(Player player){
        do {
            try {
                gameBoard.appendBoard(player.getNextMove(gameBoard), player.getSymbol());
                break;
            } catch (CellOccupiedException e) {
                System.out.println("Cell occupied! Try again!");
            }
        } while (true);
    }

    /**
     * check whether the game is over
     * @return true: game over
     */
    public boolean isGameOver(){
        return gameBoard.isFilled() || getWinner() != null;
    }

    /**
     * @return the winner of the game; return null if game is not over
     */
    public Player getWinner(){
        if(p1.getSymbol().equals(gameBoard.getWinnerSymbol())){
            return p1;
        } else if (p2.getSymbol().equals(gameBoard.getWinnerSymbol())){
            return p2;
        } else {
            return null;
        }
    }

    public void resetGameBoard(){
        gameBoard = new Board();
    }
}
