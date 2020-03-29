package com.wyischina.rougelike;
import java.text.DecimalFormat;

public class Game {

    public static void main(String[] args) {
        final double baseAttack = 1;
        final double baseHealth = 10;
        int n = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        Player player = new Player(baseHealth, baseAttack);

        System.out.println("Game Start");

        while(true){
            n++;
            Room room = new Room(n);

            if (room.isEnemy()){
                Player enemy = new Player( player.healthMax * room.seed, player.attackDmg * room.seed);
                System.out.println("Enemy HP: " + df.format(enemy.healthCurr) + "/" + df.format(enemy.healthMax));
                Duel duel = new Duel(player, enemy);
                duel.start();
            }

            if (player.healthCurr <= 0){
                System.out.println("you die");
                break;
            }
        }
    }
}
