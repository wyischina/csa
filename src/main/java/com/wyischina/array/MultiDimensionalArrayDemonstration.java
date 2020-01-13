package com.wyischina.array;

public class MultiDimensionalArrayDemonstration {

    public static void main(String[] args) {
        int table[][] = new int[3][5];
        int index = 1;
        for(int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = index;
                index++;
            }
        }

        for(int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                index = j + 5*i;
                if (index < 9) {
                    System.out.print(" ");
                }
                System.out.print(table[i][j] + " ");
                if (j == table[i].length - 1) {
                    System.out.println("");
                }
            }
        }
    }
}
