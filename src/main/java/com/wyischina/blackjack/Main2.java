package com.wyischina.blackjack;

import java.util.InputMismatchException;

public class Main2 {

    public int gamePlay() {
        Dealer dealer = new Dealer(1000, new AutomaticStrategy());
        User user = new User(1000, new AutomaticStrategy());
        Game game = new Game(dealer, user);

        do {
            //reset game
            game.resetGame();

            //bet
            while (true) {
                System.out.println("How much do you want to bet?");
                try {
                    game.askBet();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println(e + "! Please enter a number!");
                }
            }

            //starting cards
            game.drawStartingCards();

            //check for bj
            if (dealer.hand.getTotalPoints() == 21) {
                System.out.println("Dealer has Natural BlackJack!");
                game.gameReport("Final");
                continue;
            } else if (user.hand.getTotalPoints() == 21) {
                System.out.println("User has Natural BlackJack!");
                game.payout("win");
                game.gameReport("Final");
                continue;
            } else if (dealer.hand.getTotalPoints() == 21 && user.hand.getTotalPoints() == 21) {
                System.out.println("Its a tie!");
                game.payout("draw");
                game.gameReport("Final");
                continue;
            } else {
                game.gameReport("inGame");
            }

            //double down
            if (user.getMoney() > 0) {
                while (true) {
                    System.out.println("How much do you want to double down? (enter 0 if you don't want to)");
                    try {
                        game.askBet();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println(e + "! Please enter a number!");
                    }
                }
            }

            //user's turn
            game.takeTurn(user);
            if (game.bustCheck(user)) {
                System.out.println("You are busted, dealer win!");
                continue;
            }

            //dealer's turn
            game.takeTurn(dealer);
            if (game.bustCheck(dealer)) {
                System.out.println("Dealer is busted, you win!");
                game.payout("win");
                continue;
            }

            //report result
            game.gameReport("Final");

            //check for victory
            game.victoryCheck();

        } while (dealer.getMoney() > 0 && user.getMoney() > 0);

        System.out.println();
        if (user.getMoney() < dealer.getMoney()) {
            System.out.println("You are broke! Dealer wins!");
        } else {
            System.out.println("Dealer is broke! You win!");
        }

        return game.getGameIndex();
    }
}
