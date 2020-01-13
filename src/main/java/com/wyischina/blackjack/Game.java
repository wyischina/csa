package com.wyischina.blackjack;

import java.util.Scanner;

public class Game {
    public void main(String[] arg) {
        Deck deck = new Deck();
        deck.shuffle();
        User user = new User();
        Dealer dealer = new Dealer();
        Scanner scanner =  new Scanner(System.in);

        while (true) {
            System.out.println("You have" + deck.draw());
        }
    }
}
