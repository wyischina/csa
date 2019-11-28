package tictactoe;

public class Player {
    private String[] playerSquares = new String[5];
    private int numberOfSquares = 0;

    public void addSquare(String square){
        playerSquares[numberOfSquares] = square;
        numberOfSquares++;
    }


}
