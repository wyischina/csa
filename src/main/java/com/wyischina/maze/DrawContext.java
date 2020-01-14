package com.wyischina.maze;

import processing.core.PApplet;

public class DrawContext {

    private PApplet applet;

    /**
     * X-value of the bounding box.
     */
    private int x;

    /**
     * Y-value of the bounding box.
     */
    private int y;

    /**
     * Create a DrawContext from a PApplet.
     * @param applet
     */
    public DrawContext(PApplet applet, int x, int y, int width, int height) {
        this.applet = applet;
        this.x = x;
        this.y = y;
    }

    public void fill(int rgb) {
        this.applet.fill(rgb);
    }

    public void rect(int x, int y, int width, int height) {
        System.out.println(this.x + ":" + this.y);
        this.applet.translate(this.x, this.y);
        this.applet.rect(x, y, width, height);
        this.applet.translate(0,0);
    }


}
