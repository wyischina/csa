package com.wyischina.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int startN = random.nextInt(2);
        Scanner scanner = new Scanner(System.in);


        while(true) {
            Player player = new Player();
            AI AI = new AI();
            Stage board = new Stage();
            int amountOfTurns = 0;
            System.out.println("New Game");
            System.out.println("");

            while (true) {
                startN = random.nextInt(2);

                String userInputN = "";
                String userInputA = "";

                System.out.println("");
                printStage(board);
                System.out.println("");

                if (startN == 0) {
                    System.out.println("User 1: put down the tile OO.");
                    pickTile(player, AI, true, board);
                    amountOfTurns++;
                    startN = 1;
                }


                if (player.victoryScan()) {
                    System.out.println("");
                    System.out.println("User1 has won the game");
                    break;
                }

                if (amountOfTurns == 9) {
                    System.out.println("DRAW...");
                    System.out.println("New Game");
                    player = new Player();
                    AI = new AI();
                    board = new Stage();
                    break;
                }

                System.out.println("");
                printStage(board);
                System.out.println("");

                if (startN == 1) {
                    System.out.println("User 2: put down the tile XX.");
                    pickTile(player, AI, false, board);
                    amountOfTurns++;
                    startN = 0;
                }
                if (AI.victoryScan()) {
                    System.out.println("");
                    System.out.println("User2 has won the game");
                    break;
                }
                if (amountOfTurns == 9) {
                    System.out.println("DRAW...");
                    player = new Player();
                    AI = new AI();
                    board = new Stage();
                    break;
                }


            }
            System.out.println("");
            printStage(board);
            System.out.println("");

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you want to play a new Game?");
            String userInput = scanner1.nextLine();
            if(userInput.toLowerCase().equals("no")){
                break;
            }
        }

    }


    private static void printStage(Stage board){
        System.out.println("    A B C");
        System.out.println("----------");
        System.out.println("1 |" + " " +board.printStage1());
        System.out.println("2 |" + " " +board.printStage2());
        System.out.println("3 |" + " " +board.printStage3());
    }
    private static void pickTile(Player u, AI a, boolean userType, Stage board){
        if(userType) {
            while(true) {
                String userInputA = "";
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Pick a tile");
                    userInputA = scanner.nextLine();
                    if (userInputA.toUpperCase().equals("A1") || userInputA.toUpperCase().equals("B1") || userInputA.toUpperCase().equals("C1")||userInputA.toUpperCase().equals("A2") || userInputA.toUpperCase().equals("B2") || userInputA.toUpperCase().equals("C2")||userInputA.toUpperCase().equals("A3") || userInputA.toUpperCase().equals("B3") || userInputA.toUpperCase().equals("C3")) {
                        break;
                    }
                }

                if (!board.occupiedTile(userInputA)) {
                    u.putDown(userInputA, true, board);
                    break;
                } else {
                    System.out.println("Please choose an unselected tile...");
                    System.out.println("");
                }
            }

        }else{
            String[] ABC = new String[]{"A", "B", "C"};
            Random random = new Random();
            Random random2 = new Random();
            int r;
            int r2;
            int tries = 0;

            while(true){
                r = random.nextInt(3);
                r2 = random2.nextInt(3);
                if (!board.occupiedTile( ABC[r2]+(r+1))) {
                    a.putDown(ABC[r2]+(r+1), false, board);
                    break;
                } else {
                    random = new Random();
                    random2 = new Random();
                }
            }
        }
    }
}
