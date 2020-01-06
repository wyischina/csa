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
    }

}
