package com.wyischina.AsciiArt;

public class ImprovedColoringProcessor implements Processor {

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
                String foregroundColor = "\033[38;2;" + r +";" + g + ";" + b + "m";
                String backgroundColor = "\033[48;2;" + r +";" + g + ";" + b + "m";
                String character = pixels.get(col,row);
                pixels.set(col, row,  foregroundColor + backgroundColor + character + "\033[0m");
            }
        }
    }


}