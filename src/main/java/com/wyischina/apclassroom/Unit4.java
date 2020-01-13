package com.wyischina.apclassroom;

public class Unit4 {
    public static void main(String[] args) {
        longestStreak("asdfasaaaasfllkj");
    }
    public static void longestStreak(String str) {
        int max = 0;
        int result = 0;
        String string = null;
        for (int i = 0; i < str.length(); i++) {
            result = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(i, i+1).equals(str.substring(j, j+1))) {
                    if (str.substring(j, j+1).equals(str.substring(j+1, j+2))) {
                        result++;
                    }
                }
            }
            if (result > max) {
                max = result;
                string = str.substring(i, i+1);
            }
        }
        System.out.println(string + " " + max);
    }
}
