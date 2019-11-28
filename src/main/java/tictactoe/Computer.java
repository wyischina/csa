package tictactoe;

import java.util.Random;

public class Computer {
    private String[] playerSquares = new String[5];
    private int numberOfSquares = 0;
    private String[] allSquares = new String[]{"A1", "B1", "C1", "A2", "B2", "C2", "A3", "B3", "C3"};


    public void addSquare(Board gameBoard){
        Random random = new Random();
        playerSquares[numberOfSquares] = allSquares[random.nextInt(9)];
        gameBoard.nextMove(playerSquares[numberOfSquares], "X");
        numberOfSquares++;
    }

}
