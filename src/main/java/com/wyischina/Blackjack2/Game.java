package com.wyischina.Blackjack2;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        //Intro
        System.out.println("Welcome to Blackjack!");

        //Create a deck
        Deck playingDeck = new Deck();
        playingDeck.createDeck();
        playingDeck.shuffle();
        //Create a deck for the player
        Deck playerDeck = new Deck();

        //Create a deck for the dealer
        Deck dealerDeck = new Deck();

        double playerMoney = 100.00;

        Scanner userInput = new Scanner(System.in);

        //Game Loop
        while(playerMoney > 0){
            //Keep playing
            System.out.println("You have $" + playerMoney + ", how much would you like to bet?");
            double playerBet = userInput.nextDouble();
            if(playerBet > playerMoney){
                System.out.println("Sorry, you cannot bet more than you have.");
                break;
            }

            boolean endRound= false;

            //Start Dealing
            //Player gets two cards
            playerDeck.draw(playingDeck);
            playerDeck.draw(playingDeck);

            //Dealer gets two cards
            dealerDeck.draw(playingDeck);
            dealerDeck.draw(playingDeck);

            while(true){
                System.out.println("Your hand");
                System.out.println("------------------");
                System.out.print(playerDeck.toString());
                System.out.println();
                System.out.println("Your deck is valued at: " + playerDeck.cardsValue());

                //Display Dealer Hand
                System.out.println("Dealer Hand: " + dealerDeck.getCard(0).toString() + " and [Hidden]");

                //What does player want to do?
                System.out.println("Would you like to (1)HIT or (2)STAND?");
                int response = userInput.nextInt();

                //HIT
                if (response == 1){
                    playerDeck.draw(playingDeck);
                    System.out.println("You drew a: " + playerDeck.getCard(playerDeck.deckSize()-1).toString());
                    //Bust if > 21
                    if (playerDeck.cardsValue() > 21) {
                        System.out.println("Bust! You have a current value of :" + playerDeck.cardsValue());
                        playerMoney -= playerBet;
                        endRound = true;
                        break;
                    }
                }

                if (response == 2) {
                    break;
                }
            }
            //Reveal Dealer Cards
            System.out.println("Dealer Cards: " + dealerDeck.toString());
            //See if dealer has more points than player
            if (dealerDeck.cardsValue() > playerDeck.cardsValue() && !endRound) {
                System.out.println("Dealer won!");
                playerMoney -= playerBet;
                endRound = true;
            }
            //Dealer draws at 16 stand at 17
            while(dealerDeck.cardsValue() < 17 && !endRound) {
                dealerDeck.draw(playingDeck);
                System.out.println("Dealer drew: " + dealerDeck.getCard(dealerDeck.deckSize()-1).toString());
            }
            //Display Total Value for Dealer
            System.out.println("Dealer's Hand is valued at " + dealerDeck.cardsValue());
            //Determine if dealer busted
            if (dealerDeck.cardsValue() > 21 && !endRound){
                System.out.println("Dealer busted! You won!");
                playerMoney += playerBet;
                endRound = true;
            }
            //Determine if tie
            if (playerDeck.cardsValue() == dealerDeck.cardsValue() && !endRound){
                System.out.println("Tie");
                endRound= true;
            }

            if (playerDeck.cardsValue() > dealerDeck.cardsValue() && !endRound){
                System.out.println("You win!");
                playerMoney += playerBet;
                endRound = true;
            }
            playerDeck.moveAllToDeck(playingDeck);
            dealerDeck.moveAllToDeck(playingDeck);
            System.out.println("End of round.");
        }

        System.out.println("Game Over! You are out of money! :(");

    }
}
