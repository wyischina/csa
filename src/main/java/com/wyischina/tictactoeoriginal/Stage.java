package com.wyischina.tictactoeoriginal;

public class Stage {
    private Tile[] stageTile;

    public Stage(){
        stageTile = new Tile[9];
        int x = 0;
        for(int i = 0; i < 9; i++){
            stageTile[x] = new Tile(i);
            x++;
        }
    }
    public void changeStage(String x, String y, boolean userType){
        for(int i = 0; i<9; i++){
            if(stageTile[i].getTileNumber().equals(x.toUpperCase())&&stageTile[i].getTileAlphabet().equals(y.toUpperCase())){
                stageTile[i] = new Tile(userType);
            }
        }
    }
    public boolean occupiedTile(String x, String y){
        Tile t = new Tile(x,y);
        for(int i = 0; i <9; i++){
            if(stageTile[i].toString().toUpperCase().equals(t.toString().toUpperCase())){
                return false;
            }
        }
        return true;
    }

    public String printStage1(){
        String a = "";
        for(int i = 0; i < 2; i++){
            a += stageTile[i].toString() +"  |  ";
        }
        a+=stageTile[2];
        return a;
    }
    public String printStage2(){
        String a = "";
        for(int i = 3; i < 5; i++){
            a += stageTile[i].toString() +"  |  ";
        }
        a+=stageTile[5];
        return a;
    }
    public String printStage3(){
        String a = "";
        for(int i = 6; i < 8; i++){
            a += stageTile[i].toString() +"  |  ";
        }
        a+= stageTile[8];
        return a;
    }




}
