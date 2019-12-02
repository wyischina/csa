package tictactoe;

public class Player {
    private String[] playerSquares = new String[5];
    private int numberOfSquares = 0;

    public void addSquare(String square) {
        playerSquares[numberOfSquares] = square;
        numberOfSquares++;
    }

    public boolean winCheck() {
        int numberOfAs = 0;
        int numberOfBs = 0;
        int numberOfCs = 0;
        int numberOf1s = 0;
        int numberOf2s = 0;
        int numberOf3s = 0;
        boolean A1 = false;
        boolean B2 = false;
        boolean C3 = false;
        boolean A3 = false;
        boolean C1 = false;

        for (int i = 0; i < numberOfSquares; i++) {
            if ("A".equals(playerSquares[i].toUpperCase().substring(0, 1))) {
                numberOfAs++;
            } else if ("B".equals(playerSquares[i].toUpperCase().substring(0, 1))) {
                numberOfBs++;
            } else if ("C".equals(playerSquares[i].toUpperCase().substring(0, 1))) {
                numberOfCs++;
            }

            if ("1".equals(playerSquares[i].toUpperCase().substring(1, 2))) {
                numberOf1s++;
            } else if ("2".equals(playerSquares[i].toUpperCase().substring(1, 2))) {
                numberOf2s++;
            } else if ("3".equals(playerSquares[i].toUpperCase().substring(1, 2))) {
                numberOf3s++;
            }

            if (playerSquares[i].toString().equals("A1")) {
                A1 = true;
            } else if (playerSquares[i].toString().equals("A3")) {
                A3 = true;
            } else if (playerSquares[i].toString().equals("B2")) {
                B2 = true;
            } else if (playerSquares[i].toString().equals("C3")) {
                C3 = true;
            } else if (playerSquares[i].toString().equals("C1")) {
                C1 = true;
            }
        }

        if (numberOf1s == 3 || numberOf2s == 3 || numberOf3s == 3 || numberOfAs == 3 || numberOfBs == 3 || numberOfCs == 3) {
            return true;
        }

        if (A1 && B2 && C3 || A3 && B2 && C1) {
            return true;
        }
        return false;
    }
}