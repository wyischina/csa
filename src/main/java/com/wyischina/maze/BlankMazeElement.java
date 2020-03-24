package com.wyischina.maze;

public class BlankMazeElement implements MazeElement {
    @Override
    public boolean isSolid() {
        return false;
    }

    @Override
    public void draw(DrawContext context) {

    }
}
