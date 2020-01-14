package com.wyischina.maze;

/**
 * Interface representing an element on the maze map.
 */
public interface MazeElement {

    /**
     * Is the maze element a solid?
     * @return
     */
    boolean isSolid();

    /**
     * Draw the element
     */
    void draw(DrawContext context);

}
