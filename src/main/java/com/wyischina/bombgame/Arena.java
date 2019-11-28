package com.wyischina.bombgame;

import java.util.Random;

public class Arena {
    private Spaces[][] arena = new Spaces[5][10];
    private int numberOfBombs = 0;

    public Arena(){
        for(int i = 0; i <5; i++){
            for (int j = 0; j < 10; j++) {
                arena[i][j] = new Bomb(j,i, false, "[] ");
            }
        }
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++) {
                Random random = new Random();
                if(random.nextInt(4)==3){
                    arena[i][j] = new Bomb(j, i, true, "[] ");
                    numberOfBombs++;
                }
            }
            if(numberOfBombs >= 23){
                break;
            }
        }
    }

    public void printArena(){
        String print = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                print += arena[i][j].toString();
            }
            print += "\n";
        }
        System.out.println(print);
    }
    public void printFinalArena(){
        Spaces[][] finalArena = arena;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if(finalArena[i][j].isActivated()){
                    finalArena[i][j].changeType();
                }
            }
        }
        String print = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                print += finalArena[i][j].toString();
            }
            print += "\n";
        }
        System.out.println(print);

    }
    public void changeArena(int x, int y, String name){
        if(name.toLowerCase().equals("player")){
            arena[y][x] = new Player(x,y);
        } else if(name.toLowerCase().equals("bomb")){
            arena[y][x].changeType();
        }
    }
    public boolean checkBomb(int x, int y){
        if(arena[y][x].isActivated()){
            return true;
        }else{
            return false;
        }
    }
}
