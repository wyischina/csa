package com.wyischina.maze;

/**
 * Class representing a maze map. A maze map is made up of a grid of #MazeElement.
 */
public class MazeMap {

    /**
     * Number of horizontal elements.
     */
    private int width;

    /**
     * Number of vertical elements.
     */
    private int height;


    private MazeElement[][] grid;

    /**
     * Create a MazeMap with blank elements.
     * @param width number of horizontal elements.
     * @param height number of vertical elements.
     */
    public MazeMap(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new MazeElement[this.width][this.height];
        initialiseBlank();
    }

    /**
     * Initialise the grid as blank #BlankMazeElement.
     */
    protected void initialiseBlank() {
        for(int i = 0; i < this.grid.length; i++) {
            for(int j = 0; j < this.grid[i].length; j++) {
                this.grid[i][j] = Math.random() > 0.8 ? new BlankMazeElement() : new WallMazeElement();
            }
        }
    }

    /**
     * Get the number of horizontal elements
     * @return
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Get the number of horizontal elements
     * @return
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Maze element.
     * @param x
     * @param y
     * @return
     */
    public MazeElement getMazeElement(int x, int y) {
        return this.grid[x][y];
    }



}
