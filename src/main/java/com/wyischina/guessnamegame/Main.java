package com.wyischina.guessnamegame;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        System.out.println("GUESS NAME GAME! \n");
        while(true){
            Playboard playboard = new Playboard();
            System.out.println("NEW ROUND! \n");
            playboard.printBoard();
            int tries = 2;
            while(tries>0){
                System.out.println(tries + " attempt(s) left");
                if(tries ==1){
                    System.out.println("*HINT* \nthe first letter of the name: "+ playboard.getAnswerName().substring(0,1)+"\n");
                }
                System.out.println("What do you think the name is? :).......");
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();
                if(userInput.toLowerCase().equals(playboard.getAnswerName().toLowerCase())){
                    System.out.println("YOU GOT IT! \n");
                    break;
                }else{
                    System.out.println("\n NAHHHH YOU ARE WRONG!. \n");
                    tries--;
                }
            }
            if(tries == 0){
                System.out.println("\n This was the answer: "+playboard.getAnswerName());
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to play again? yes or no.");
            String userInput = scanner.nextLine();
            if(userInput.toLowerCase().equals("no")){
                break;
            }
        }
    }
}
