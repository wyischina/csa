package com.wyischina.AsciiArt;

/**
 * Mr Lee's sample Processor
 */
public class SampleProcessor implements Processor {
  
   /**
    * Takes in the pixels representation of the colored image and use the brightness of the pixel 
    * to convert into a Ascii character that resembles the brightness (density) of the pixel in the Ascii art.
    */
   public void process(Pixels pixels) {
       String characters = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
       int totalBrightness = characters.length() - 1;
       for (int row = 0; row < pixels.getHeight(); row++) {
           for (int col = 0; col < pixels.getWidth(); col++) {
               int r = pixels.getRed(col, row);
               int g = pixels.getGreen(col, row);
               int b = pixels.getBlue(col, row);
               int brightness = (Math.max(Math.max(r, g), b) +
                       Math.min(Math.min(r, g), b)) / 2;
               double ratio = brightness / 255d;
               int index = (int)((1 - ratio) * totalBrightness);
               String character = characters.substring(index, index+1);
               pixels.set(col, row,  character);
           }
       }
   }
  
}