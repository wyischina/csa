package com.wyischina.tictactoe;

public class Player {
    private Strategy strategy;
    private String symbol;
    private String name;

    public Player(Strategy strategy, String symbol, String name){
        this.strategy = strategy;
        this.symbol = symbol;
        this.name = name;
    }

    /**
     * prompts until the user enters a valid cell
     * @return Move - the row and col of the cell
     */
    public Move getNextMove(Board board) {
        do {
            try {
                return this.strategy.getNextMove(board);
            } catch (InvalidCellException e) {
                System.out.println("Invalid Cell! Try again!");
            }
        } while(true);
    }

    /**
     * @return the symbol that is assigned to the player
     */
    public String getSymbol(){
        return this.symbol;
    }

    /**
     * @return the name of the player
     */
    public String getName(){
        return this.name;
    }
}
