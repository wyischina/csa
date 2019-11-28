package com.wyischina.tictactoe;

import java.util.Random;

public class AI extends User {
    Tile[] AITiles = new Tile[5];
    int AINumberOfTiles = 0;
    int AINumberOfAs=0;
    int AINumberOfBs=0;
    int AINumberOfCs = 0;
    int AINumberOf1s = 0;
    int AINumberOf2s = 0;
    int AINumberOf3s = 0;

    public AI(){
        Tile[] AITiles = new Tile[5];
        int numberOfTiles = 0;
        int numberOfAs=0;
        int numberOfBs=0;
        int numberOfCs = 0;
        int numberOf1s = 0;
        int numberOf2s = 0;
        int numberOf3s = 0;
    }


    public void putDown(String tile, boolean userType, Stage stage){

        stage.changeStage(tile, userType);
        this.AITiles[AINumberOfTiles] = new Tile(tile);
        this.AINumberOfTiles++;
        if (tile.substring(1,2).toUpperCase().equals("1")) {
            this.AINumberOfAs++;
        }
        if (tile.substring(1,2).toUpperCase().equals("2")) {
            this.AINumberOfBs++;
        }
        if (tile.substring(1,2).toUpperCase().equals("3")) {
            this.AINumberOfCs++;
        }
        if (tile.substring(0, 1).toUpperCase().equals("A")) {
            this.AINumberOf1s++;
        }
        if (tile.substring(0, 1).toUpperCase().equals("B")) {
            this.AINumberOf2s++;
        }
        if (tile.substring(0, 1).toUpperCase().equals("C")) {
            this.AINumberOf3s++;
        }


    }


    public boolean victoryScan(){
        if(this.AINumberOf1s==3||this.AINumberOf2s==3||this.AINumberOf3s==3||this.AINumberOfAs==3||this.AINumberOfBs==3||this.AINumberOfCs==3){
            return true;
        }
        boolean B2 = false;
        boolean A1 = false;
        boolean C3 = false;
        boolean A3 = false;
        boolean C1 = false;
        for(int i = 0; i < AINumberOfTiles; i++){
            if(AITiles[i].toString().toUpperCase().equals("B2")) {
                B2 = true;
            }
            if(AITiles[i].toString().toUpperCase().equals("A1")) {
                A1 = true;
            }
            if(AITiles[i].toString().toUpperCase().equals("C3")) {
                C3 = true;
            }
            if(AITiles[i].toString().toUpperCase().equals("A3")) {
                A3 = true;
            }
            if(AITiles[i].toString().toUpperCase().equals("C1")){
                C1 = true;
            }
        }

        if(A1&&B2&&C3||A3&&B2&&C1){
            return true;
        }
        return false;
    }


}
