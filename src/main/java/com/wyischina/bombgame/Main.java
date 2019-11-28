package com.wyischina.bombgame;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lives = 3;
        int points = 0;
        int nMoves = 20;
        System.out.println("SNAKE AND BOMB GAME!");
        System.out.println("");
        System.out.println("Your goal is to reach the end...");
        System.out.println("However, there are bombs planted on the field, and if" + "\n" +"you step on it, you die. If you reach the end, you win.");
        System.out.println("There are two things that the snake can do: move or check.");
        System.out.println("If you move, you can move up, down, left, and right.");
        System.out.println("If you check, you can either detect or dig. If you detect, ");
        System.out.println("you can see how many bombs are placed around you (up, down, and");
        System.out.println("right; not left). if you dig, you can dig a bomb, and if there is a bomb,");
        System.out.println("you will dig it and move on that spot. However, if you dig the wrong place, you");
        System.out.println("will break your shovel. You have four shovels. You have a total of 3 lives. Try to get 5 points...");
        System.out.println("You will have certain amount of moves you can do ");
        while (lives>0&&points<5) {
            int shovels = 4;
            int moves = nMoves;
            System.out.println("");
            System.out.println("");
            System.out.println("You have "+points+" point(s) and "+lives+" heart(s).");
            System.out.println("");
            System.out.println("");
            System.out.println("NEW GAME");
            String victory = "";
            Arena arena = new Arena();

            Player player = new Player();
            player.setPoint(arena, 0, 2);
            arena.printArena();

            while (true) {
                System.out.println(+moves+ " move(s) left." + "\n"+ shovels +" shovel(s) left.");
                System.out.println("");
                String userAnswer = "";
                Scanner scanner = new Scanner(System.in);
                System.out.println("");
                System.out.println("What do you want to do?" + "\n" + "Move(type 1) or Check(type 2)?");
                userAnswer = scanner.nextLine();
                String userInput = userAnswer;
                if (userInput.equals("1")) {
                    moves--;
                    while (true) {
                        System.out.println("Right(d), Left(a), Up(w), or Down(s)?");
                        userInput = scanner.nextLine();
                        if (userInput.toLowerCase().equals("d")) {
                            try {
                                arena.checkBomb(player.getxCoordinate() + 1, player.getyCoordinate());
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("YOU HAVE REACHED THE END!!!!! YOU WON");
                                victory = "victory";
                                break;
                            }
                            if (arena.checkBomb(player.getxCoordinate() + 1, player.getyCoordinate())) {
                                System.out.println("YOU STEPPED ON A BOMB");
                                victory = "fail";
                                break;
                            }
                            player.setPoint(arena, player.getxCoordinate() + 1, player.getyCoordinate());
                            arena.printArena();
                            break;
                        }
                        if (userInput.toLowerCase().equals("a")) {
                            if (player.getxCoordinate() == 0) {
                                System.out.println("Cannot go there...");
                                continue;
                            }
                            if (arena.checkBomb(player.getxCoordinate() - 1, player.getyCoordinate())) {
                                System.out.println("YOU STEPPED ON A BOMB");
                                victory = "fail";
                                break;
                            }
                            player.setPoint(arena, player.getxCoordinate() - 1, player.getyCoordinate());
                            arena.printArena();
                            break;
                        }
                        if (userInput.toLowerCase().equals("w")) {
                            if (player.getyCoordinate() == 0) {
                                System.out.println("Cannot go there");
                                continue;
                            }
                            if (arena.checkBomb(player.getxCoordinate(), player.getyCoordinate() - 1)) {
                                System.out.println("YOU STEPPED ON A BOMB");
                                victory = "fail";
                                break;
                            }
                            player.setPoint(arena, player.getxCoordinate(), player.getyCoordinate() - 1);
                            arena.printArena();
                            break;
                        }
                        if (userInput.toLowerCase().equals("s")) {
                            if (player.getyCoordinate() == 4) {
                                System.out.println("Cannot go there");
                                continue;
                            }
                            if (arena.checkBomb(player.getxCoordinate(), player.getyCoordinate() + 1)) {
                                System.out.println("YOU STEPPED ON A BOMB");
                                victory = "fail";
                                break;
                            }
                            player.setPoint(arena, player.getxCoordinate(), player.getyCoordinate() + 1);
                            arena.printArena();
                            break;
                        }
                    }
                    if (victory.equals("fail")) {
                        System.out.println("YOU DIED...");
                        lives--;
                        arena.printFinalArena();
                        break;
                    }
                    if (victory.equals("victory")) {
                        System.out.println("YOU WON...:)");
                        points++;
                        nMoves=nMoves-2;
                        arena.printFinalArena();
                        break;
                    }
                    if(moves==0){
                        System.out.println("You ran out of moves...");
                        lives--;
                        arena.printFinalArena();
                        break;
                    }

                }
                if (userInput.equals("2")) {
                    while (true) {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Do you want to detect surrounding bombs or dig a bomb?" + "\n" + "detect(1) or dig(2).");
                        String userInput2 = scanner2.nextLine();
                        if (userInput2.equals("1")) {
                            //can only check for right top and down...
                            int nBomb = 0;
                            try{
                                if (arena.checkBomb(player.getxCoordinate(), player.getyCoordinate() + 1)) {
                                    //up
                                    nBomb++;
                                }
                            }catch(IndexOutOfBoundsException e){}
                            try{
                                if (arena.checkBomb(player.getxCoordinate(), player.getyCoordinate() - 1)) {
                                    //down
                                    nBomb++;
                                }
                            }catch(IndexOutOfBoundsException e){}
                            try{
                                if (arena.checkBomb(player.getxCoordinate() + 1, player.getyCoordinate())) {
                                    //right
                                    nBomb++;
                                }
                            }catch(IndexOutOfBoundsException e){}
                            System.out.println("You have " + nBomb + " bomb(s) around you (right, up, or down; not left)");
                            System.out.println("");
                            arena.printArena();
                            break;
                        }
                        if (userInput2.equals("2")) {
                            if(shovels == 0){
                                System.out.println("You do not have a shovel.");
                                continue;
                            }
                            while (true) {
                                System.out.println("Which way?(right(d), up(w), or down(s))");
                                userInput2 = scanner2.nextLine();
                                if (userInput2.toLowerCase().equals("d")) {
                                    if (arena.checkBomb(player.getxCoordinate() + 1, player.getyCoordinate())) {
                                        arena.changeArena(player.getxCoordinate() + 1, player.getyCoordinate(), "player");
                                        System.out.println("you have successfully dug up a bomb...!");
                                        player.setPoint(arena, player.getxCoordinate()+1, player.getyCoordinate());
                                        arena.printArena();
                                        shovels--;
                                        break;
                                    }else{
                                        System.out.println("oops... Wrong place...");
                                        shovels--;
                                        arena.printArena();
                                        break;
                                    }
                                }
                                if (userInput2.toLowerCase().equals("w")) {
                                    try {
                                        if (arena.checkBomb(player.getxCoordinate(), player.getyCoordinate() - 1)) {
                                            arena.changeArena(player.getxCoordinate(), player.getyCoordinate() - 1, "player");
                                            System.out.println("you have successfully dug up a bomb...!");
                                            player.setPoint(arena, player.getxCoordinate()+1, player.getyCoordinate());
                                            arena.printArena();
                                            shovels--;
                                            break;
                                        } else{
                                            System.out.println("oops... Wrong place...");
                                            shovels--;
                                            arena.printArena();
                                            break;
                                        }
                                    } catch (IndexOutOfBoundsException e) {
                                        System.out.println("No Bomb there...");
                                    }
                                }
                                if (userInput2.toLowerCase().equals("s")) {
                                    try {
                                        if (arena.checkBomb(player.getxCoordinate(), player.getyCoordinate() + 1)) {
                                            arena.changeArena(player.getxCoordinate(), player.getyCoordinate() + 1, "player");
                                            System.out.println("you have successfully dug up a bomb...!");
                                            player.setPoint(arena, player.getxCoordinate()+1, player.getyCoordinate());
                                            shovels--;
                                            arena.printArena();
                                            break;
                                        } else{
                                            System.out.println("oops... Wrong place...");
                                            shovels--;
                                            arena.printArena();
                                            break;
                                        }
                                    } catch (IndexOutOfBoundsException e) {
                                        System.out.println("No Bomb there...");
                                    }
                                }
                            }
                            break;
                        }
                    }
                }


            }

        }
        if(lives == 0){
            System.out.println("");
            System.out.println("Zero heart...You lost...");
        }
        if(points == 5){
            System.out.println("");
            System.out.println("5 points! Didn't know you would make It. You WON!");
        }
    }
}
