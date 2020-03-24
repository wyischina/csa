package com.wyischina.maze;

public class WallMazeElement implements MazeElement {
    @Override
    public boolean isSolid() {
        return true;
    }

    @Override
    public void draw(DrawContext context) {
        context.fill(0xFF0000);
        context.rect(0, 0, 50, 50);
    }
}
