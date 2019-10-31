package com.wyischina.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTestResultsTest {

    @Test
    public void testCreateMathTestResults() {
        TestResults testResults = new MathTestResults();
        assertEquals(0, testResults.getNumberOfScores());
    }
    @Test
    public void testGetNumberOfScores() {
        TestResults testResults = new MathTestResults();
        testResults.addScore("jim", 10);
        testResults.addScore("yi", 10);
        testResults.addScore("jjjj", 10);
        assertEquals(3, testResults.getNumberOfScores());
    }
    @Test
    public void testGetMaxScore() {
        TestResults testResults = new MathTestResults();
        testResults.addScore("jim", 90);
        testResults.addScore("yi", 88);
        testResults.addScore("jjjj", 78);
        assertEquals(90, testResults.getMaximumScore());
    }
    @Test
    public void testGetMinScore() {
        TestResults testResults = new MathTestResults();
        testResults.addScore("jim", 87);
        testResults.addScore("yi", 88);
        testResults.addScore("jjjj", 78);
        assertEquals(78, testResults.getMinimumScore());
    }
    @Test
    public void testGetMeanScore() {
        TestResults testResults = new MathTestResults();
        testResults.addScore("jim", 87);
        testResults.addScore("yi", 88);
        testResults.addScore("jjjj", 78);
        assertEquals(84, testResults.getMeanScore());
    }
    @Test
    public void testGetStudentWithMaximumScore() {
        TestResults testResults = new MathTestResults();
        testResults.addScore("jim", 87);
        testResults.addScore("yi", 88);
        testResults.addScore("jjjj", 98);
        assertEquals("jjjj", testResults.getStudentWithMaximumScore());
    }
    @Test
    public void testStupids() {
        TestResults testResults = new MathTestResults();
        testResults.addScore("jim", 86);
        testResults.addScore("yi", 88);
        testResults.addScore("jjjj", 90);
        String[] failedStudentNames = {"jim"};
        assertArrayEquals(failedStudentNames, testResults.getFailedStudents(87));
    }

}
