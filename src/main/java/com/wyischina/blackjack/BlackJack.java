package com.wyischina.blackjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        User user = new User();
        Dealer dealer = new Dealer();
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        for(int i = 0; i < 2; i++) {
            x = user.userDraw(deck);
        }

        System.out.println("you have: " + user.showCard());
        System.out.println(x);
        System.out.println("type 'n' to draw new card, type 'm' to stay");
        String choice = scanner.next();
        while (true) {
            if(deck.nextCardIndex >= 51){
                System.out.println("no more card left");
                break;
            }
            if (choice.equals("n")) {
                x = user.userDraw(deck);
                System.out.println(x);
                if (x <= 21) {
                    System.out.println("you have: " + user.showCard());
                    Scanner newscan = new Scanner(System.in);
                    choice = newscan.next();
                } else {
                    System.out.println("you lost (bust)" + user.showCard());
                    Scanner newscan = new Scanner(System.in);
                    System.out.println("restart? press 'r' else press 'x'");
                    choice = newscan.next();
                }
            }
            if (choice.equals("m")) {
                System.out.println(dealer.dealerDraw(deck));
                Scanner newscan = new Scanner(System.in);
                System.out.println("restart? press 'r' else press 'x'");
                choice = newscan.next();
            }
            if (choice.equals("r")) {
                System.out.println("");
                System.out.println("restart!");
                user.reset();
                dealer.dReset();
                for(int i = 0; i < 2; i++) {
                    x = user.userDraw(deck);
                }
                System.out.println("you have: " + user.showCard());
                System.out.println(x);
                System.out.println("type 'n' to draw new card, type 'm' to stay");
                Scanner scan = new Scanner(System.in);
                choice = scan.next();
            }
            if(choice.equals("x")){
                break;
            }
        }
    }
}
