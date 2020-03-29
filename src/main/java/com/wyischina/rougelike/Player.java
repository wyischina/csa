package com.wyischina.rougelike;

public class Player {
    double healthMax;
    double healthCurr;
    double attackDmg;

    public Player(double healthMax, double attackDmg){
        this.healthMax = healthMax;
        this.healthCurr = healthMax;
        this.attackDmg = attackDmg;
    }
}
