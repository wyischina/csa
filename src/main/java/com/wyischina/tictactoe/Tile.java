package com.wyischina.tictactoe;

public class Tile {
    private String tileNumber;
    private String tileAlphabet;

    public Tile(boolean x ){
        if(x){
            tileAlphabet = "O";
            tileNumber= "";
        } else {
            tileAlphabet = "X";
            tileNumber = "";
        }
    }
    public Tile(String x, String y){
        tileNumber = x;
        tileAlphabet = y;
    }
    public Tile(String x){
        tileAlphabet = x.substring(0, 1);
        tileNumber = x.substring(1, 2);
    }

    public Tile(int x){
        if(x == 0||x==1||x==2){
            tileNumber = "1";
        }
        if(x == 3||x==4||x==5){
            tileNumber = "2";
        }
        if(x == 6||x==7||x==8){
            tileNumber = "3";
        }
        if(x == 0||x==3||x==6){
            tileAlphabet = "A";
        }
        if(x == 1|x==4||x==7){
            tileAlphabet = "B";
        }
        if(x == 2|x==5||x==8){
            tileAlphabet = "C";
        }
    }

    public String getTileAlphabet(){return tileAlphabet;}
    public String getTileNumber(){return tileNumber;}
    public String toString(){return tileAlphabet + tileNumber;}
}
