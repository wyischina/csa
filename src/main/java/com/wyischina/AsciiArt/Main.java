package com.wyischina.AsciiArt;

public class Main {
  public static void main(String[] args) {

//    colorTest();

    art();

//    System.out.println("\033[38;2;255;0;0m" + "\033[48;2;255;0;0m" + "RED");
  }

  private static void art(){
    AsciiArt art = new AsciiArt("https://placekitten.com/400/200", 80);

//    art.addProcessor(new SampleProcessor());
    art.addProcessor(new ColorBasedProcessor());
    art.addProcessor(new InvertBrightnessProcessor());
//    art.addProcessor(new RemoveDarkBackgroundProcessor());

    art.addProcessor(new ColoringProcessor());
//    art.addProcessor(new ImprovedColoringProcessor());
    art.addProcessor(new DoubleWidthProcessor());

    System.out.println(art.toString());
  }

  private static void colorTest(){
    AsciiArt colorTest = new AsciiArt("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/RGB_color_wheel_360.svg/750px-RGB_color_wheel_360.svg.png", 70);

    colorTest.addProcessor(new SampleProcessor());
//    colorTest.addProcessor(new InvertBrightnessProcessor());
//    colorTest.addProcessor(new RemoveDarkBackgroundProcessor());

    colorTest.addProcessor(new ColoringProcessor());
    colorTest.addProcessor(new DoubleWidthProcessor());

    System.out.println(colorTest.toString());
  }
}