package com.wyischina.blackjack;

import java.util.Scanner;

public class Player extends Participant {


    /**
     * Create a participant with a initial balance.
     *
     * @param initialBalance the initial balance.
     */
    public Player(int initialBalance) {
        super(initialBalance);
    }

    /**
     * Prompt the human player for a bet amount.
     * @return
     */
    public int promptForBetAmount() {
        System.out.println("Please enter your bet");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Prompt the user for the next move.
     * @return Move the next move.
     */
    public Move promptForNextMove() {
        while(true) {
            System.out.println("Your hand is " + getHand().toString());
            System.out.println("What would you like to do? (H for hit, S for stand, D for double down)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            switch(s.toLowerCase().trim()) {
                case "h":
                    return Move.Hit;
                case "s":
                    return Move.Stand;
                case "d":
                    return Move.DoubleDown;
            }
        }
    }

}
