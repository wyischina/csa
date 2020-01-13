package com.wyischina.maze;

import java.util.ArrayList;

public class Board {
    Tile tile = new Tile();
    Blank blank = new Blank();
    Wall wall = new Wall();
    private Tile[][] board = new Tile[10][10];

    public void setDefault(int x, int y) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                tile.insert("");
            }
            System.out.println("");
        }
    }
    public void locate() {

    }
    public void printBoard() {

    }
}
