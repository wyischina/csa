package com.wyischina.TickTackToe;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args){
        computer com = new computer();
        player me = new player();
        userEnter userenter = new userEnter();
        int row = 0;
        int col = 0;
        int randomcol = 0;
        int randomrow = 0;
        int order = 0;
        String[][] table = new String[3][3];
        for(int j = 0; j < table.length; j++) {
        for(int i = 0; i < 3; i++) {
            table[j][i] = " □";
        }
    }
        Random ran = new Random();
        order = ran.nextInt(2);
        while(true) {
            if(order == 1) {         // reading random starting order between user and computer
                System.out.println("  A B C");
                System.out.println("--------");
                System.out.println("1" + table[0][0] + table[1][0] + table[2][0]);
                System.out.println("2" + table[0][1] + table[1][1] + table[2][1]);
                System.out.println("3" + table[0][2] + table[1][2] + table[2][2]);
                System.out.println("what is your next move?");
                System.out.print("> ");
                while(true) {
                    //read user's position

                    Scanner scanner = new Scanner(System.in);
                    String scan = scanner.next();
                    row = Character.getNumericValue(scan.charAt(1));
                    if (Character.toString(scan.charAt(0)).equals("A") || Character.toString(scan.charAt(0)).equals("a")) {
                        col = 0;
                    } else if (Character.toString(scan.charAt(0)).equals("B") || Character.toString(scan.charAt(0)).equals("b")) {
                        col = 1;
                    } else {
                        col = 2;
                    }
                    if (table[col][row - 1].equals(" O") || table[col][row - 1].equals(" X")) {
                        System.out.println("retry");
                    } else {
                        System.out.println(me.userEntered(scan));
                        table[col][row - 1] = " O";
                        break;
                    }
                }
                if (me.won()) {
                    System.out.println("  A B C");
                    System.out.println("--------");
                    System.out.println("1" + table[0][0] + table[1][0] + table[2][0]);
                    System.out.println("2" + table[0][1] + table[1][1] + table[2][1]);
                    System.out.println("3" + table[0][2] + table[1][2] + table[2][2]);

                    // asking if the user will restart
                    System.out.println("continue? press 'o'. finish? press 'x'");
                    Scanner retry = new Scanner(System.in);
                    String cont = retry.next();
                    if (cont.equals("o")) {
                        com = new computer();
                        me = new player();
                        row = 0;
                        col = 0;
                        randomcol = 0;
                        randomrow = 0;
                        table = new String[3][3];
                        for (int j = 0; j < table.length; j++) {
                            for (int i = 0; i < 3; i++) {
                                table[j][i] = " □";
                            }
                        }
                        order = ran.nextInt(1);
                        continue;
                    } else {
                        break;
                    }
                }
            }
            while(true) {
                //random positions are set for computer

                order = 1;
                Random random = new Random();
                Random rrran = new Random();
                randomcol = random.nextInt(3);
                randomrow = rrran.nextInt(3);
                if (!(table[randomcol][randomrow].equals(" O") || table[randomcol][randomrow].equals(" X"))) {
                    table[randomcol][randomrow] = " X";
                    System.out.println(com.comEntered(randomcol,randomrow));
                    break;
                }
            }
            if(com.won()){
                System.out.println("  A B C");
                System.out.println("--------");
                System.out.println("1" + table[0][0] + table[1][0] + table[2][0]);
                System.out.println("2" + table[0][1] + table[1][1] + table[2][1]);
                System.out.println("3" + table[0][2] + table[1][2] + table[2][2]);

                // asking if the user will restart
                System.out.println("continue? press 'o'. finish? press 'x'");
                Scanner retry = new Scanner(System.in);
                String cont = retry.next();
                if(cont.equals("o")){
                    com = new computer();
                    me = new player();
                    row = 0;
                    col = 0;
                    randomcol = 0;
                    randomrow = 0;
                    table = new String[3][3];
                    for(int j = 0; j < table.length; j++) {
                        for(int i = 0; i < 3; i++) {
                            table[j][i] = " □";
                        }
                    }
                    order = ran.nextInt(1);
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}
