package com.wyischina.AsciiArt;

import java.io.InputStream;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
import java.awt.*; 
import java.io.*; 
import java.net.URL;

/**
 * Class that converts a coloured image into Ascii Art. The conversion is performed by Processors that are added
 * to this class. 
 */
public class AsciiArt {

  private BufferedImage image;
  private java.util.List<Processor> processors = new ArrayList<Processor>();
  private Map<String, String> pixelValues = new HashMap<String, String>();
  
  /**
   * Create a new AsciiArt image
   * @param imageUrl URL to load the original colored image
   * @param desiredWidth the desired width in pixels of the Ascii image
   */
  public AsciiArt(String imageUrl, int desiredWidth) {
    try {
      InputStream is = new URL(imageUrl).openStream();
      try {
        image = ImageIO.read(is);
      } catch (IOException e) {
        throw new IllegalArgumentException("unable to read image - " + e.getMessage());
      }
      int newWidth = desiredWidth;
      int newHeight = (int) (desiredWidth * 1.0d / image.getWidth() * image.getHeight());
      BufferedImage resized = new BufferedImage(newWidth, newHeight, image.getType());
      Graphics2D g = resized.createGraphics();
      g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
          RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      g.drawImage(image, 0, 0, newWidth, newHeight, 0, 0, image.getWidth(),
          image.getHeight(), null);
      g.dispose();
      this.image = resized;
    } catch (IOException e) {
      throw new IllegalArgumentException("unable to load image at " + imageUrl + ": " + e.getMessage());
    }
  }

  /**
   * Add an image processor that will called in sequence when
   * @param processor to run in sequence when toString() is called
   */
  public void addProcessor(Processor processor) {
    this.processors.add(processor);
  }

  /**
   * Convert the Ascii art image to a String.
   * @return String Ascii art image as a String.
   */
  public String toString() {
    Pixels pixels = new PixelsImpl();
    for (Processor p : processors) {
      p.process(pixels);
    }
    StringBuffer buffer = new StringBuffer();
    for (int row = 0; row < pixels.getHeight(); row++) {
      for(int col = 0; col < pixels.getWidth(); col++) {
        buffer.append(pixels.get(col, row));
      }
      buffer.append("\n");
    }
    return buffer.toString();
  }

  /**
   * Write the Ascii art to a text file
   * @param fileName of the file
   */
  public void writeTo(String fileName) {
    FileWriter writer = null;
    try {
      writer = new FileWriter(fileName);
      writer.write(toString());
    } catch (Throwable e) {
      throw new IllegalStateException("unable to write to file: " + e.getMessage());
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException e2) {
          // ignore
        }
      }
    }
  }

  /**
   * Internal class for representing a pixels
   */
  private class PixelsImpl implements Pixels {
    /**
    * Get the number of pixels horizontally
    */
    public int getWidth() {
      return image.getWidth();
    }

    /**
    * Get number of pixels vertically
    */
    public int getHeight() {
      return image.getHeight();
    }

    /**
    * Set the Ascii pixel value
    */
    public void set(int x, int y, String characters) {
      pixelValues.put(x + "." + y, characters);
    }

    /**
    * Get the Ascii pixel value
    */
    public String get(int x, int y) {
      String pixel = pixelValues.get(x + "." + y);
      return pixel != null ? pixel : " ";
    }

    /**
    * Get the red intensity
    */
    public int getRed(int x, int y) {
      Color c = new Color(image.getRGB(x, y));
      return c.getRed();
    }

    /**
    * Get the blue intensity.
    */
    public int getBlue(int x, int y) {
      Color c = new Color(image.getRGB(x, y));
      return c.getBlue();
    }

    /**
    * Get the green intensity
    */
    public int getGreen(int x, int y) {
      Color c = new Color(image.getRGB(x, y));
      return c.getGreen();
    }
  }

}