package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Board gameBoard = new Board();
        gameBoard.createNewBoard();
        Player player = new Player();
        Computer computer = new Computer();

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your next move?");
            String inputPosition = scanner.nextLine();
            player.addSquare(inputPosition);
            gameBoard.nextMove(inputPosition, "O");
            gameBoard.printBoard();

            System.out.println("Computer's move:");
            computer.addSquare(gameBoard);



        }
    }
}
