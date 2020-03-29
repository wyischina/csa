package com.wyischina.AsciiArt;

/**
 * An interface representing a processor that examines colored image pixels and convert them into 
 * Ascii characters.
 */
public interface Processor {

  /**
   * Process the image pixels and generate Ascii art charcter 'pixel'.
   */
  public void process(Pixels pixels);

}