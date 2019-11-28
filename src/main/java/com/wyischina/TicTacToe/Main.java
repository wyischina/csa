package com.wyischina.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            Game game = new Game();
            System.out.println("-=+ Tic Tac Toe +=-");
            System.out.println("What sized board would you like? (e.g. 3x3, 5x5, etc.)");
            String boardSize = input.nextLine();

            game.setBoardDimension(boardSize);
            game.fillBoard();
            game.printBoard();

            game.whoseTurn();
            while(true){
                if(game.turn.equals("Player")){
                    game.setPlayerMark();
                    game.printBoard();
                    if(game.winningRow() || game.winningColumn() || game.winningDiagonalOne() || game.winningDiagonalTwo()){
                        System.out.println("Game Over! " + game.winner + " wins!");
                        break;
                    }
                    game.turn = "Dealer";
                } else{
                    game.computersTurn();
                    game.printBoard();
                    if(game.winningRow() || game.winningColumn() || game.winningDiagonalOne() || game.winningDiagonalTwo()){
                        System.out.println("Game Over! " + game.winner + " wins!");
                        break;
                    }
                    game.turn = "Player";
                }

                if(game.boardFull()){
                    System.out.println("Draw! Game Over!");
                    break;
                }
            }

            System.out.println("Play again? Yes/No");
            String userInput = input.nextLine().toUpperCase();
            if(userInput.equals("NO")){
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}


