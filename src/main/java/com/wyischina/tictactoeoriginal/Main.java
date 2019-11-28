package com.wyischina.tictactoeoriginal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Start Game");
        System.out.println("");

        User user1 = new User();
        User user2 = new User();
        Stage board = new Stage();
        int amountOfTurns=0;

        while(true) {
           String userInputN = "";
           String userInputA = "";

            System.out.println("");
            printStage(board);
            System.out.println("");

            System.out.println("User 1: put down the tile OO.");
            pickTile(user1, true, board);
            if (user1.victoryScan()) {
                System.out.println("User1 has won the game");
                break;
            }
            amountOfTurns++;
            if(amountOfTurns==9){
                System.out.println("DRAW...");
                System.out.println("New Game");
                user1 = new User();
                user2 = new User();
                board = new Stage();
                continue;
            }

            System.out.println("");
            printStage(board);
            System.out.println("");

            System.out.println("User 2: put down the tile XX.");
            pickTile(user2, false, board);
            if (user2.victoryScan()) {
                System.out.println("User2 has won the game");
                break;
            }
            amountOfTurns++;
        }
        System.out.println("");
        printStage(board);
        System.out.println("");

    }
    private static void printStage(Stage board){
        System.out.println(board.printStage1());
        System.out.println("__     __     __");
        System.out.println(board.printStage2());
        System.out.println("__     __     __");
        System.out.println(board.printStage3());
    }
    private static void pickTile(User u, boolean userType, Stage board){
        while(true) {
            String userInputA = "";
            String userInputN = "";
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Pick the Alphabet of the tile");
                userInputA = scanner.nextLine();
                if (userInputA.toUpperCase().equals("A") || userInputA.toUpperCase().equals("B") || userInputA.toUpperCase().equals("C")) {
                    break;
                }
            }
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Pick the Number of the tile");
                userInputN = scanner.nextLine();
                if (userInputN.equals("1") || userInputN.equals("2") || userInputN.equals("3")) {
                    break;
                }
            }
            if (!board.occupiedTile(userInputN, userInputA)) {
                u.putDown(userInputN, userInputA, userType, board);
                break;
            } else {
                System.out.println("Please choose an unselected tile...");
                System.out.println("");
            }
        }
    }
}
