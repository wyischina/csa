package com.wyischina.tictactoe;

public class Player extends User {
    Tile[] userTiles = new Tile[5];
    int numberOfTiles = 0;
    int numberOfAs=0;
    int numberOfBs=0;
    int numberOfCs = 0;
    int numberOf1s = 0;
    int numberOf2s = 0;
    int numberOf3s = 0;

    public Player(){
        Tile[] userTiles = new Tile[5];
        int numberOfTiles = 0;
        int numberOfAs=0;
        int numberOfBs=0;
        int numberOfCs = 0;
        int numberOf1s = 0;
        int numberOf2s = 0;
        int numberOf3s = 0;
    }
    public void putDown(String tile, boolean userType, Stage stage){
        stage.changeStage(tile,userType);
        userTiles[numberOfTiles] = new Tile(tile);
        this.numberOfTiles++;
        if(tile.substring(1,2).toUpperCase().equals("1")){
            this.numberOfAs++;
        }
        if(tile.substring(1,2).toUpperCase().equals("2")){
            this.numberOfBs++;
        }
        if(tile.substring(1,2).toUpperCase().equals("3")){
            this.numberOfCs++;
        }
        if(tile.substring(0, 1).toUpperCase().equals("A")){
            this.numberOf1s++;
        }
        if(tile.substring(0, 1).toUpperCase().equals("B")){
            this.numberOf2s++;
        }
        if(tile.substring(0, 1).toUpperCase().equals("C")){
            this.numberOf3s++;
        }

    }
    public boolean victoryScan(){
        if(this.numberOf1s==3||this.numberOf2s==3||this.numberOf3s==3||this.numberOfAs==3||this.numberOfBs==3||this.numberOfCs==3){
            return true;
        }
        boolean B2 = false;
        boolean A1 = false;
        boolean C3 = false;
        boolean A3 = false;
        boolean C1 = false;
        for(int i = 0; i < this.numberOfTiles; i++){
            if(userTiles[i].toString().toUpperCase().equals("B2")) {
                B2 = true;
            }
            if(userTiles[i].toString().toUpperCase().equals("A1")) {
                A1 = true;
            }
            if(userTiles[i].toString().toUpperCase().equals("C3")) {
                C3 = true;
            }
            if(userTiles[i].toString().toUpperCase().equals("A3")) {
                A3 = true;
            }
            if(userTiles[i].toString().toUpperCase().equals("C1")){
                C1 = true;
            }
        }

        if(A1&&B2&&C3||A3&&B2&&C1){
            return true;
        }
        return false;
    }
}
