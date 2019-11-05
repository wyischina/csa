package com.wyischina.oop;

import com.wyischina.array.MathTestResults;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTestResultsTest {

    @Test
    public void addScoreTest() {
        MathTestResults t = new MathTestResults();
        t.addScore("John", 100);
        t.addScore("Jun", 90);
        t.addScore("Jedi", 30);
        assertEquals(3, t.getNumberOfScores());
    }

    @Test
    public void getNumberOfScoresTests() {
        MathTestResults t = new MathTestResults();
        t.addScore("Jun", 100);
        t.addScore("John", 20);
        t.addScore("Jedi", 30);
        t.addScore("Joh", 30);
        assertEquals(4, t.getNumberOfScores());
    }

    @Test
    public void getMaxScoresTests() {
        MathTestResults t = new MathTestResults();
        t.addScore("Jun", 100);
        t.addScore("John", 20);
        t.addScore("Jedi", 30);
        t.addScore("Joh", 10);
        assertEquals(100, t.getMaximumScore());
    }

    @Test
    public void getMaxScoreTests2() {
        MathTestResults t = new MathTestResults();
        assertEquals(0, t.getMaximumScore());
    }

    @Test
    public void getMinScoreTests() {
        MathTestResults t = new MathTestResults();
        t.addScore("Jun", 100);
        t.addScore("John", 20);
        t.addScore("Jedi", 30);
        t.addScore("Joh", 40);
        assertEquals(20, t.getMinimumScore());
    }

    @Test
    public void getMinScoreTests2() {
        MathTestResults t = new MathTestResults();
        assertEquals(0, t.getMinimumScore());
    }

    @Test
    public void getMeanScoreTests() {
        MathTestResults t = new MathTestResults();
        t.addScore("John", 100);
        t.addScore("Jun", 50);
        t.addScore("Jedi", 20);
        t.addScore("Joh", 30);
        assertEquals(50, t.getMeanScore());
    }

    @Test
    public void getMeanScoreTests2() {
        MathTestResults t = new MathTestResults();
        assertEquals(0, t.getMeanScore());
    }

    @Test
    public void getStudentWithMaxScoreTests() {
        MathTestResults t = new MathTestResults();
        t.addScore("Jun", 100);
        t.addScore("John", 50);
        t.addScore("Jedi", 20);
        t.addScore("Joh", 30);
        assertEquals("Jun", t.getStudentWithMaximumScore());
    }

    @Test
    public void getStudentWithMaxScoreTests2() {
        MathTestResults t = new MathTestResults();
        assertEquals(null, t.getStudentWithMaximumScore());
    }

    @Test
    public void getFailedStudentsTests() {
        MathTestResults t = new MathTestResults();
        t.addScore("Jun", 100);
        t.addScore("John", 95);
        t.addScore("Jedi", 92);
        t.addScore("Joh", 69);
        assertArrayEquals(new String[]{"Joh"}, t.getFailedStudents(90));
    }

    @Test
    public void getFailedStudentsTests2() {
        MathTestResults t = new MathTestResults();
        assertArrayEquals(new String[]{}, t.getFailedStudents(90));
    }
}






