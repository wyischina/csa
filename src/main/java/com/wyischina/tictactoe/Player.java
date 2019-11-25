package com.wyischina.tictactoe;

public abstract class Player {

    private String symbol;
    private String name;

    /**
     * Create a new Player.
     * @param symbol
     */
    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * Get the symbol representing the user.
     * @return String the symbol.
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Get the name of the user.
     * @return String the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the next move from the player.
     * @param board the current state of the board.
     * @return Move the next valid move.
     */
    public abstract Move getNextMove(Board board);

}
