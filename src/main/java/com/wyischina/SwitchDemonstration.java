package com.wyischina;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SwitchDemonstration {

    public static void main(String[] args) {
        int value = 10;
        switch(value) {
            case 10:
                System.out.println("case 10");
                break;
            case 11:
                System.out.println("case 11");
                break;
            default:
                System.out.println("default case");
        }

    }

}
