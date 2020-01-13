package com.wyischina.processing;

import processing.core.PApplet;

public class Grid {

    // define attributes to represent data of this grid.

    /**
     * Create a Grid
     * @param columns number of columns
     * @param rows number of rows
     */
    public Grid(int columns, int rows) {
        // create a grid with the specified number of columns of rows.
    }

    /**
     * Draw a grid based on the number of columns and grid
     * @param window representing the Window (i.e. the canvas) to draw things on.
     */
    public void draw(PApplet window) {
        // write code to draw a grid based on the columns and rows of this grid.
        window.line(0, 0, window.width, window.height);
    }

}
