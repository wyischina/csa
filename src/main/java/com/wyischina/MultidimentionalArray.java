package com.wyischina;

public class MultidimentionalArray {

    public static void main(String[] args) {
        int[][] array = new int[3][5];
        int num = 1;

        for (int x = 0; x < 3; x++) {
            for (int i = 0; i < 5; i++) {
                if (true) {
                    //int[][] store = new int [3][5];
                    //num = store[x][i];
                    //store[x][i] = array[x][i];
                    array[x][i] = num;
                    num++;
                }
            }
        }
    }
}
