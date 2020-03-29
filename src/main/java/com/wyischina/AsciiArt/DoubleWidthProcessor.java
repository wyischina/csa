package com.wyischina.AsciiArt;

public class DoubleWidthProcessor implements Processor {
  
   /**
    * Doubles the width of the Ascii art while keeping the height the same.
    */
   public void process(Pixels pixels) {
       for (int row = 0; row < pixels.getHeight(); row++) {
           for (int col = 0; col < pixels.getWidth(); col++) {
               String character = pixels.get(col, row);
               pixels.set(col, row,  character + character);
           }
       }
   }
  
}