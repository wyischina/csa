package com.wyischina.shape;

public abstract class Shape {
    public int fillColor;
    public int outlineColor;
    public Point topLeft;
    public int width;
    public int height;
    public abstract void draw();
}
