package com.wyischina.blackjack;

import java.sql.SQLOutput;

public class Statistic {
    public static void main(String[] args) {
        Main2 gamePlay = new Main2();
        int n = 100;
        int totalPoints = 0;
        for (int i = 0; i < n; i++) {
            totalPoints += gamePlay.gamePlay();
        }
        System.out.println("Average number of games before game over:" + totalPoints/(double)n);
    }
}
