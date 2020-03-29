package com.wyischina.AsciiArt;

public enum TextColor {
    RESET("\033[0m", -255, -255, -255),

    BLACK("\033[0;30m", 12, 12, 12),    // BLACK
    RED("\033[0;31m", 197, 15, 31),      // RED
    GREEN("\033[0;32m", 19, 161, 14),    // GREEN
    YELLOW("\033[0;33m", 193, 156, 0),   // YELLOW
    BLUE("\033[0;34m", 0, 55, 218),     // BLUE
    MAGENTA("\033[0;35m", 136, 23, 152),  // MAGENTA
    CYAN("\033[0;36m", 58, 150, 221),     // CYAN
    WHITE("\033[0;37m", 204, 204, 204),   // WHITE

    BRIGHT_BLACK("\033[0;90m", 118,118,118),
    BRIGHT_RED("\033[0;91m", 231,72,86),
    BRIGHT_GREEN("\033[0;92m", 22,198,12),
    BRIGHT_YELLOW("\033[0;93m", 249,241,165),
    BRIGHT_BLUE("\033[0;94m", 59,120,255),
    BRIGHT_MAGENTA("\033[0;95m", 180,0,158),
    BRIGHT_CYAN("\033[0;96m", 97,214,214),
    BRIGHT_WHITE("\033[0;97m", 242,242,242);


    private final String code;
    private final int r;
    private final int g;
    private final int b;

    TextColor(String code, int r, int g, int b){
        this.code = code;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString(){
        return code;
    }

    public static TextColor matchColor(int r, int g, int b){
        double minColorDistance = Integer.MAX_VALUE;
        TextColor color = null;
        for(TextColor c: TextColor.values()){
            double colorDistance =  (Math.pow(r - c.r, 2) + Math.pow(g - c.g, 2) + Math.pow(b - c.b, 2));
            if(colorDistance < minColorDistance){
                minColorDistance = colorDistance;
                color = c;
            }
        }
        return color;
    }
}
