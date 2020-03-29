package com.wyischina.AsciiArt;

public class ColorBasedProcessor implements Processor {
  
   /**
    * Deduce the brightness using the color of each pixel
    */
   public void process(Pixels pixels) {
       String characters = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
       int totalBrightness = characters.length() - 1;
       for (int row = 0; row < pixels.getHeight(); row++) {
           for (int col = 0; col < pixels.getWidth(); col++) {
               int r = pixels.getRed(col, row);
               int g = pixels.getGreen(col, row);
               int b = pixels.getBlue(col, row);
               int brightness = r + g + b;
               double ratio = brightness / 765d;
               int index = (int)((1 - ratio) * totalBrightness);
               String character = characters.substring(index, index+1);
               pixels.set(col, row,  character);
           }
       }
   }
  
}