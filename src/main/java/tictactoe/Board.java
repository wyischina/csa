package tictactoe;

public class Board {
    private Square[][] board= new Square[3][3];


    public void createNewBoard (){
        int x = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] = new Square(i,j);
            }
        }
    }

    public void nextMove(String inputPosition, String userInput){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j].toString().toUpperCase().equals(inputPosition.toUpperCase())){
                    board[i][j] = new Square(userInput);
                }
            }
        }
    }
    public boolean isOccupied(String inputPosition){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j].toString().toUpperCase().equals(inputPosition.toUpperCase())){
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard(){
        String gameBoard = "";
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j].toString().toUpperCase().equals("O"+"")){
                    gameBoard += " O";
                } else if(board[i][j].toString().toUpperCase().equals("X"+"")){
                    gameBoard += " X";
                } else {
                    gameBoard += " □";
                }
            }
            gameBoard += "\n";
        }

        System.out.println(gameBoard);
    }
}
