package com.wyischina.tictactoe;

import java.util.Scanner;

public class ManualStrategy implements Strategy {

    /**
     * prompts the user of their next move
     * @return the move that the user enters
     * @throws InvalidCellException
     */
    @Override
    public Move getNextMove(Board board) throws InvalidCellException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your next move?");
        return new Move(scanner.nextLine());
    }
}
