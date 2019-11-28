package com.wyischina.blackjack;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("StartGame");
        User user = new User(1000);
        Computer computer = new Computer();
        int payOff = 2;
        int totalBet = 0;
        int busted= 0;
        int bettingMoney=0;

        System.out.println("You have 1000RMB");

        while (user.getMoney() > 0) {
            CardPile deck = new CardPile();
            user.newUserDeck();
            computer.newComputerDeck();
            totalBet=0;
            busted = 0;
            System.out.println("");
            System.out.println("");
            System.out.println("New Round START");
            System.out.println("How much will you bet?");
            do {
                System.out.println("**You cannot bet more than what you Have" + "(" + user.getMoney() + ")");
                while (true) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        bettingMoney = scanner.nextInt();
                        //...
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please put in a number");
                    }
                }
                if (bettingMoney <= user.getMoney()) {
                    break;
                }

            }while(true);
            totalBet += bettingMoney;
            user.addTransaction(-bettingMoney);

            computer.startGame(deck.drawCard(), deck.drawCard());

            user.addCard(deck.drawCard());
            user.addCard(deck.drawCard());

            System.out.println("These are the dealer's cards: " + computer.revealCards());
            System.out.println("These are your cards: " + user.revealCards());
            if (computer.getTotalValue() == 21){
                System.out.println("DEALER'S BLACK JACK!!!!!!!!!! " + computer.finalRevealCards());
                System.out.println("");
                System.out.println("You have " + user.getMoney() +"RMB left.");
                continue;
            }
            if (user.getTotalValue() == 21){
                System.out.println("YOU HAVE A BLACK JACK!!!!!!!!!! ");
                System.out.println("");
                user.addTransaction(totalBet*2);
                System.out.println("You have " + user.getMoney() +"RMB left.");
                continue;
            }
            System.out.println("");
            System.out.println("How much will you bet? Put in Zero if you want.");
            do{
                System.out.println("**You cannot bet more than what you Have" + "("+user.getMoney()+")");
                while (true) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        bettingMoney = scanner.nextInt();
                        //...
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please put in an integer");
                    }
                }
                if(bettingMoney <= user.getMoney()){
                    break;
                }
            }while(true);
            totalBet += bettingMoney;
            user.addTransaction(-bettingMoney);


            while (user.getTotalValue() <= 21) {
                System.out.println("Hit or Stand?");
                Scanner scanner = new Scanner(System.in);
                String hitOrStand;
                while (true) {
                    try {
                        hitOrStand = scanner.next();
                        break;
                    } catch (InputMismatchException e) {
                    }
                }
                if (hitOrStand.toLowerCase().equals("hit")) {
                    user.addCard(deck.drawCard());
                    System.out.println("These are your cards " + user.revealCards());
                    if (user.getTotalValue() > 21) {
                        System.out.println("You are Busted");
                        busted++;
                        break;
                    }
                } else if (hitOrStand.toLowerCase().equals("stand")) {
                    break;
                }
            }
            if (user.getTotalValue() <= 21) {
                while (computer.getTotalValue() < 16) {
                    computer.addCard(deck.drawCard());
                    }
                if (computer.getTotalValue() > 21) {
                    System.out.println("Dealer is busted");
                    busted++;
                    user.addTransaction(totalBet*2);
                }
            }
            System.out.println("These are the dealer's cards: " + computer.finalRevealCards());

            if(busted==0){
                if(user.getTotalValue()>computer.getTotalValue()){
                    System.out.println("You won.");
                    user.addTransaction(totalBet*2);
                }else if(user.getTotalValue()<computer.getTotalValue()){
                    System.out.println("You lost");
                } else if(user.getTotalValue()==computer.getTotalValue()){
                    System.out.println("DRAW!");
                    user.addTransaction(totalBet);
                }
            }
            System.out.println("");
            System.out.println("You have " + user.getMoney() +"RMB left.");

        }
        System.out.println("");
        System.out.println("");

        System.out.println("GAME OVER!");
    }

}
