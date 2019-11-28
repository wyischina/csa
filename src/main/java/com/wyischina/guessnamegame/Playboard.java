package com.wyischina.guessnamegame;

import java.util.Random;

public class Playboard {
    private int lengthOfName;
    private String[] alphabets = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private String[][] playArea;
    private String answerName;

    public Playboard(){
        Random random = new Random();
        NameList nameList = new NameList();
        answerName = nameList.getRandomName();
        lengthOfName = answerName.length();

        playArea = new String[lengthOfName][6];

        for (int i = 0; i < lengthOfName; i++) {
            for (int j = 0; j < 6; j++) {
                playArea[i][j] = alphabets[random.nextInt(26)];
                random = new Random();
            }
        }

        for (int i = 0; i < lengthOfName; i++) {
            random = new Random();
            playArea[i][random.nextInt(6)] = answerName.substring(i,i+1).toUpperCase();
        }

    }

    public void printBoard(){
        String printMaterial = "";
        for (int i = 0; i < lengthOfName; i++) {
            for (int j = 0; j < 6; j++) {
                printMaterial += " " +playArea[i][j]+ " ";
            }
            printMaterial += "\n";
        }
        System.out.println(printMaterial);
    }
    public String getAnswerName(){
        return answerName;
    }
}
