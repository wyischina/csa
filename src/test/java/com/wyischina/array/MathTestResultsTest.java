package com.wyischina.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTestResultsTest {

    @Test
    void testCreateMathTestResults() {
        TestResults test = new MathTestResults();
        test.addScore("a", 80);
        test.addScore("b", 38);
        test.addScore("c", 62);
        assertEquals(3, test.getNumberOfScores());
    }

    @Test
    void testGetMaximumScore(){
        TestResults test = new MathTestResults();
        test.addScore("a", 80);
        test.addScore("b", 38);
        test.addScore("c", 62);
        assertEquals(80, test.getMaximumScore());
    }

    @Test
    void testGetMinimumScore(){
        TestResults test = new MathTestResults();
        test.addScore("a", 80);
        test.addScore("b", 38);
        test.addScore("c", 62);
        assertEquals(38, test.getMinimumScore());
    }
    @Test
    void testGetMeanScore() {
        TestResults test = new MathTestResults();
        test.addScore("a", 80);
        test.addScore("b", 38);
        test.addScore("c", 62);
        assertEquals(60, test.getMeanScore());
    }
    @Test
    void testGetStudentWithMaximumScore() {
        TestResults test = new MathTestResults();
        test.addScore("a", 80);
        test.addScore("b", 38);
        test.addScore("c", 62);
        assertEquals("a", test.getStudentWithMaximumScore());
    }
    @Test
    void testGetFailedStudents() {
        TestResults test = new MathTestResults();
        test.addScore("a", 80);
        test.addScore("b", 38);
        test.addScore("c", 62);
        String[] failedStudents = {"b"};
        assertArrayEquals(failedStudents, test.getFailedStudents(50));
    }
}
