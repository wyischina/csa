package com.wyischina.processing;

import processing.core.PApplet;

public class ProcessingDemonstration extends PApplet {

    @Override
    public void settings() {
        super.settings();
        size(500, 500);
    }

    public void draw(){
        ellipse(mouseX, mouseY, 50, 50);
    }

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        ProcessingDemonstration sketch = new ProcessingDemonstration();
        PApplet.runSketch(processingArgs, sketch);
    }

}
