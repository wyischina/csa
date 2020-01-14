package com.wyischina.shape;

public abstract class Shape implements Drawable, Selectable{
    public int fillColor;
    public int outlineColor;
    public Point topLeft;
    public int width;
    public int height;
    public void select() {
        // draw an outline when shape is selected
    }
    public void deselect() {
        // hide the outline when shape is selected
    }
}
