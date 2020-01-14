package com.wyischina.shape;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Polygon();
        shapes[1] = new Ellipsis();
        // ... initialize the shapes ...
        for (Shape shape : shapes) {
            shape.draw();
        }

        Drawable[] drawables = new Drawable[10];
        drawables[0] = new Polygon();
        drawables[1] = new Ellipsis();
        drawables[2] = new Background();
        for (Drawable drawable : drawables) {
            drawable.draw();
        }

    }

}
