package com.wyischina.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Human user = new Human(new ManualStrategy(), "O", "Human");
        Computer computer = new Computer(new AutomaticStrategy(), "X", "Computer");
        Game game = new Game(user, computer);
        Scanner playAgain = new Scanner(System.in);
        Random rand = new Random();

        do {
            int firstMove = rand.nextInt(1);
            game.print();
            do {
                // randomly determines who moves first
                if(firstMove == 0){
                    // user's move
                    System.out.println("Your turn:");
                    game.takeTurn(user);
                    if(game.isGameOver()){
                        break;
                    }
                } else {
                    // computer's move
                    System.out.println("Computer turn:");
                    game.takeTurn(computer);
                    if(game.isGameOver()){
                        break;
                    }
                }

                // the other player moves
                if(firstMove == 0){
                    // computer's move
                    System.out.println("Computer turn:");
                    game.takeTurn(computer);
                    if(game.isGameOver()){
                        break;
                    }
                } else {
                    // user's move
                    System.out.println("Your turn:");
                    game.takeTurn(user);
                    if(game.isGameOver()){
                        break;
                    }
                }

                game.print();

            } while (true);

            // display the result of the game
            System.out.println("Game Over");
            System.out.println();
            if (game.getWinner() != null) {
                System.out.println("Winner is " + game.getWinner().getName());
            } else {
                System.out.println("Its a tie!");
            }

            // reset game
            game.resetGameBoard();

            // prompt the human player whether to start a new game after a game has finished
            System.out.println("\nDo you want to play again?\n" +
                    "(Yes)       (No)");

        } while (playAgain.nextLine().toUpperCase().equals("YES"));
    }
}
