package com.wyischina.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTestResultsTest {

    @Test
    public void testCreateMathTestResults() {
        TestResults testResults = new MathTestResults();
        assertEquals(0, testResults.getNumberOfScores());
    }
}
