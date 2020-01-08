package com.wyischina.maze;

import processing.core.PApplet;

/**
 * Main class of the maze app.
 */
public class MazeApp extends PApplet {

    /**
     * Width of the maze window.
     */
    private int width;

    /**
     * Height of the maze window.
     */
    private int height;

    /**
     * Maze map.
     */
    private MazeMap map;

    /**
     * Create a MazeApp.
     */
    public MazeApp(int width, int height, MazeMap map) {
        this.width = width;
        this.height = height;
        this.map = map;
    }


    @Override
    public void settings() {
        super.settings();
        size(this.width, this.height);
    }

    @Override
    public void draw() {
        super.draw();
        int cellWidth = this.width / this.map.getWidth();
        int cellHeight = this.height / this.map.getHeight();
        for(int i = 0; i < this.map.getWidth(); i++) {
            for(int j = 0; j < this.map.getHeight(); j++) {
                MazeElement e = this.map.getMazeElement(i, j);
                e.draw(new DrawContext(this, i * cellWidth, j *cellHeight, cellWidth, cellHeight));
                System.out.println("draw cell: " + i + "/" + j);
            }
        }
    }

    /**
     * Run the maze app.
     */
    public void run() {
        String[] processingArgs = {"WYIS Maze"};
        PApplet.runSketch(processingArgs, this);
    }


    /**
     * Run the app.
     * @param args
     */
    public static void main(String[] args) {
        MazeApp app = new MazeApp(400, 400, new MazeMap(20, 20));
        app.run();
    }

}
