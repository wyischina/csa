package com.wyischina.tictactoeoriginal;

public class User{
    Tile[] userTiles = new Tile[5];
    int numberOfTiles = 0;
    int numberOfAs=0;
    int numberOfBs=0;
    int numberOfCs = 0;
    int numberOf1s = 0;
    int numberOf2s = 0;
    int numberOf3s = 0;

    public User(){
        Tile[] userTiles = new Tile[5];
        int numberOfTiles = 0;
        int numberOfAs=0;
        int numberOfBs=0;
        int numberOfCs = 0;
        int numberOf1s = 0;
        int numberOf2s = 0;
        int numberOf3s = 0;
    }

    public void putDown(String x, String y, boolean userType, Stage stage){
        stage.changeStage(x,y,userType);
        userTiles[numberOfTiles] = new Tile(x,y);
        numberOfTiles++;
        if(x.toUpperCase().equals("1")){
            numberOfAs++;
        }
        if(x.toUpperCase().equals("2")){
            numberOfBs++;
        }
        if(x.toUpperCase().equals("3")){
            numberOfCs++;
        }
        if(y.toUpperCase().equals("A")){
            numberOf1s++;
        }
        if(y.toUpperCase().equals("B")){
            numberOf2s++;
        }
        if(y.toUpperCase().equals("C")){
            numberOf3s++;
        }

    }

    public boolean victoryScan(){
        if(numberOf1s==3||numberOf2s==3||numberOf3s==3||numberOfAs==3||numberOfBs==3||numberOfCs==3){
            return true;
        }
        boolean B2 = false;
        boolean A1 = false;
        boolean C3 = false;
        boolean A3 = false;
        boolean C1 = false;
        for(int i = 0; i < numberOfTiles; i++){
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
