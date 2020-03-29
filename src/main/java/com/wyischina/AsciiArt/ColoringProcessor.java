package com.wyischina.AsciiArt;

public class ColoringProcessor implements Processor {

    /**
     * Adds color to a Ascii art based on the color of the original image.
     */
    public void process(Pixels pixels) {
        for (int row = 0; row < pixels.getHeight(); row++) {
            for (int col = 0; col < pixels.getWidth(); col++) {
                int r = pixels.getRed(col, row);
                int g = pixels.getGreen(col, row);
                int b = pixels.getBlue(col, row);

                String color = "\033[38;2;" + r +";" + g + ";" + b + "m";
                String character = pixels.get(col,row);

                pixels.set(col, row,  color + character + "\033[0m");
            }
        }
    }


}