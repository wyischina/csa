package com.wyischina.AsciiArt;

import java.util.Map;

/**
 * An abstraction that allows a Processor to interact with the colored image's pixel value and to 
 * set the Ascii value of the Ascii image pixel.
 */
public interface Pixels {

  /**
   * Get the number of pixels horizontally
   */
  int getWidth();

  /**
   * Get number of pixels vertically
   */
  int getHeight();

  /**
   * Set the Ascii image pixel value as a character
   * @param x the column index
   * @param y the row index
   * @params characters String to represent this pixel in the Ascii art image.
   */
  void set(int x, int y, String characters);

  /**
   * Get the Ascii image pixel value as a character.
   * @param x the column index
   * @param y the row index
   * @return the string representing the pixel of value of the Ascii image.
   */
  String get(int x, int y);

  /**
   * Get the red intensity of the original image.
   * @return an integer between 0 and 255. 255 is the most intense, 0 is least intense.
   */
  int getRed(int x, int y);

  /**
   * Get the blue intensity in the original image.
   * @return an integer between 0 and 255. 255 is the most intense, 0 is least intense. 
   */
  int getBlue(int x, int y);

  /**
   * Get the green intensity in the original image.
   * @return an integer between 0 and 255. 255 is the most intense, 0 is least intense.
   */
  int getGreen(int x, int y);

}