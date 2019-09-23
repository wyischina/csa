package com.wyischina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaclaurinSeriesTest {

    @Test
    void sineOf0Andk0() {
        MaclaurinSeries series = new MaclaurinSeries();
        assertEquals(0d, series.sine(0, 0));
    }

    @Test
    void sineOf90Andk10() {
        MaclaurinSeries series = new MaclaurinSeries();
        assertEquals(1d, series.sine(Math.toRadians(90), 10), 0.01);
    }

    @Test
    void sineOf45Andk10() {
        MaclaurinSeries series = new MaclaurinSeries();
        assertEquals(0.70d, series.sine(Math.toRadians(45), 10), 0.01);
    }
}