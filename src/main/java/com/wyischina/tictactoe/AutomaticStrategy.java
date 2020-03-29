package com.wyischina.tictactoe;

import java.util.Random;

public class AutomaticStrategy implements Strategy {

    private Random rand = new Random();

    @Override
    public Move getNextMove(Board board) {
        return new Move(rand.nextInt(3), rand.nextInt(3));
    }
}
