package tictactoe;

public class Square {
    private String alphabet;
    private String number;
    private String[] ABC = {"A","B","C"};

    public Square(int i, int j){
        number = ""+(i + 1);
        alphabet = ABC[j];
    }
    public String toString(){
        return alphabet+number;
    }

    public Square(String x){
        number = "";
        alphabet = x;
    }
    
}
