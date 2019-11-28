package com.wyischina.tictactoe;

public class Stage {
    private Tile[][] stageTile;

    public Stage(){
        stageTile = new Tile[3][3];
        for(int i = 0; i < 3; i++){
            String x= ""+(i+1);
            stageTile[i][0] = new Tile((x), "A");
            stageTile[i][1] = new Tile((x), "B");
            stageTile[i][2] = new Tile((x), "C");
        }
    }
    public void changeStage(String tile, boolean userType){
        for(int i = 0; i<3; i++){
            for(int z = 0;z<3; z++){
                if(stageTile[i][z].toString().toUpperCase().equals(tile.toUpperCase())){
                    stageTile[i][z] = new Tile(userType);
                }
            }
        }
    }
    public boolean occupiedTile(String tile){
        Tile t = new Tile(tile);
        for(int i = 0; i <3 ; i++){
            for(int b = 0; b <3; b++){
                if(stageTile[i][b].toString().toUpperCase().equals(t.toString().toUpperCase())){
                    return false;
                }
            }
        }
        return true;
    }

    public String printStage1(){
        String a = "";
        for(int i = 0; i < 3; i++){
            if(stageTile[0][i].toString().equals("O")||stageTile[0][i].toString().equals("X")){
                a += stageTile[0][i].toString() +" ";
            }else{
                a += "□ ";
            }
        }

        return a;
    }
    public String printStage2(){
        String a = "";
        for(int i = 0; i < 3; i++){
            if(stageTile[1][i].toString().equals("O")||stageTile[1][i].toString().equals("X")){
                a += stageTile[1][i].toString() +" ";
            }else{
                a += "□ ";
            }
        }
        return a;
    }
    public String printStage3(){
        String a = "";
        for(int i = 0; i < 3; i++){
            if(stageTile[2][i].toString().equals("O")||stageTile[2][i].toString().equals("X")){
                a += stageTile[2][i].toString()+" ";
            }else{
                a += "□ ";
            }
        }
        return a;
    }
    public Tile[][] getStageTile(){return stageTile;}




}
