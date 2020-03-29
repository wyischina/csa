package com.wyischina.AsciiArt;

public class RemoveDarkBackgroundProcessor implements Processor {


    public void process(Pixels pixels) {
        String characters = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";

        for (int row = 0; row < pixels.getHeight(); row++) {
            for (int col = 0; col < pixels.getWidth(); col++) {
                if(characters.indexOf(pixels.get(col, row)) >= characters.indexOf("o")){
                    pixels.set(col, row, " ");
                }
            }
        }
    }

}
