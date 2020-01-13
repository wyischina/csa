package com.wyischina.processing;

import processing.core.PApplet;

public class GridApp extends PApplet {

    private Grid grid;

    private GridApp() {
        this.grid = new Grid(10, 20);
    }

    public void settings() {
        size(400, 400);
        smooth();
    }

    public void setup() {
        surface.setResizable(true);
        surface.setTitle("Grid App");
    }

    public void draw() {
        background(0xFFFFFF);
        this.grid.draw(this);
    }

    public static void main(String[] args) {
        GridApp app = new GridApp();
        PApplet.runSketch(new String[]{"GridApp"}, app);
    }

}
