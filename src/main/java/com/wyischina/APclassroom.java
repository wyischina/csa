package com.wyischina;

public class APclassroom {

    public static void main(String[] args) {
        APclassroom ap = new APclassroom();
        ap.playRound();

    }

    public int spin(int min, int max) {
        int result;
        result = (int) (Math.random() * max + 0.5);
        return result;
    }


    public void playRound() {
        int cSpin = spin(2, 8);
        int pSpin = spin(1, 10);
        if (pSpin > cSpin) {
            System.out.println("You win!" + (pSpin - cSpin) + " points");
        } else if (cSpin > pSpin) {
            System.out.println("You lose." + (pSpin - cSpin) + " points");
        } else {
            int c = spin(2, 8);
            int p = spin(1, 10);
            if (c + cSpin > p + pSpin) {
                System.out.println("You lose. -1 point");
            } else if (p + pSpin > c + cSpin) {
                System.out.println("You win! 1 point");
            } else {
                System.out.println("Tie. 0 point");
            }

        }

    }
}
