package com.wyischina;

public class StringMethods {

    /**
     * Pad a string s with additional pad characters on the left if the length of the string s is shorter
     * than n characters.
     *
     * For example,
     * padLeft("Hello", 5, 'x').equals("Hello")
     * padLeft("Hello", 10, 'x').equals("xxxxxHello")
     * padLeft("Hello", 3, 'x').equals("Hello")
     * padLeft("Hello", 7, ' ').equals("  Hello")
     *
     * @param s
     * @param n
     * @param pad
     * @return
     */
    public String padLeft(String s, int n, char pad) {
        if (s.length() > n){
            return s;
        }
        StringBuilder pads = new StringBuilder();
        pads.append(String.valueOf(pad).repeat(n - s.length()));
        s = pads.toString().concat(s);
        return s;
    }

}
