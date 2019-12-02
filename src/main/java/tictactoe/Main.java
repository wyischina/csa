package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static <listOfPlayers> void main(String[] args){
        while(true) {
            Board gameBoard = new Board();
            gameBoard.createNewBoard();
            Player player = new Player();
            Computer computer = new Computer();

            System.out.println("Welcome to Claire's Tic-Tac-Toe Game!");
            gameBoard.createNewBoard();
            System.out.println("  A B C ");
            System.out.println("---------");
            System.out.println("1 □ □ □");
            System.out.println("2 □ □ □");
            System.out.println("3 □ □ □");
            Random random = new Random();
            int start = random.nextInt(2);
            int turns = 0;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                while (start == 0) {
                    System.out.println("What is your next move?");
                    String inputPosition = scanner.nextLine();
                    if (inputPosition.toUpperCase().equals("A1") ||
                            inputPosition.toUpperCase().equals("B1") ||
                            inputPosition.toUpperCase().equals("C1") ||
                            inputPosition.toUpperCase().equals("A2") ||
                            inputPosition.toUpperCase().equals("B2") ||
                            inputPosition.toUpperCase().equals("C2") ||
                            inputPosition.toUpperCase().equals("A3") ||
                            inputPosition.toUpperCase().equals("B3") ||
                            inputPosition.toUpperCase().equals("C3")) {
                    } else {
                        continue;
                    }

                    if (gameBoard.isOccupied(inputPosition)) {
                        System.out.println("Please choose a different position");
                        continue;
                    }
                    player.addSquare(inputPosition);
                    gameBoard.nextMove(inputPosition, "O");

                    System.out.println("  A B C ");
                    System.out.println("---------");
                    gameBoard.printBoard();
                    turns++;
                    break;
                }

                if (player.winCheck()) {
                    System.out.println("You win!");
                    break;
                }

                if(turns == 9){
                    System.out.println("It's a tie!");
                    break;
                }

                System.out.println("Computer's move:");
                computer.addSquare(gameBoard);
                start = 0;

                System.out.println("  A B C ");
                System.out.println("---------");
                gameBoard.printBoard();
                turns++;

                if (computer.winCheck()) {
                    System.out.println("Computer wins!");
                    break;
                }

                if(turns == 9){
                    System.out.println("It's a tie!");
                    break;
                }
            }
            System.out.println("Do you want to play again?");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (userInput.toLowerCase().equals("no")){
                break;
            }
        }
    }
}
