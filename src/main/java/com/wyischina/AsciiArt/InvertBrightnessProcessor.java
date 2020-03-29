package com.wyischina.AsciiArt;

public class InvertBrightnessProcessor implements Processor {

    public void process(Pixels pixels) {
        String characters = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
        for (int row = 0; row < pixels.getHeight(); row++) {
            for (int col = 0; col < pixels.getWidth(); col++) {
                int index = characters.length() - 1 - characters.indexOf(pixels.get(col, row));
                String character = characters.substring(index, index+1);
                pixels.set(col, row,  character);
            }
        }
    }
}
