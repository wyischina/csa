package com.wyischina.blackjack;

import java.util.Scanner;

public class ManualStrategy implements Strategy {

    public Move getNextMove(Hand hand) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hit(1) or stand(2)?");
        return Move.values()[scanner.nextInt() - 1];
    }

    public int getBet(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
