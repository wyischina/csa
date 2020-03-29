package com.wyischina.rougelike;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Duel {
    Player player;
    Player enemy;
    private Scanner inputer = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    public Duel(Player player, Player enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public void start(){
        System.out.println("duel");
        System.out.println("1: Attack    2: Escape");
        int input = inputer.nextInt();
        if(input == 1){
            System.out.println("You attacked the enemy");
            enemy.healthCurr -= player.attackDmg;


            System.out.println("Your enemy attacked you");
            player.healthCurr -= enemy.attackDmg;

            System.out.println("Enemy HP: " + df.format(enemy.healthCurr) + "/" + df.format(enemy.healthMax));
            System.out.println("Your HP: " + df.format(player.healthCurr) + "/" + df.format(player.healthMax));
        }
    }
}
