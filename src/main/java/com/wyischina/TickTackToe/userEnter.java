package com.wyischina.TickTackToe;

// this class changes value of entered position for computer and player class

public class userEnter {
    String character = null;
    int number = 0;

    public void convert(String s){
        number = Character.getNumericValue(s.charAt(1));
        character = Character.toString(s.charAt(0));
    }
    public int character(){
        if(character.equals("A") || character.equals("a")){
            return 1;
        } else if (character.equals("B") || character.equals("b")){
            return 2;
        } else {
            return 3;
        }
    }
    public int number(){
        return this.number;
    }
}
