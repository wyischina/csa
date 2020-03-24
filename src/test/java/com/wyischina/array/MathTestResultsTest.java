package com.wyischina.array;

import com.wyischina.oop.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTestResultsTest {

    @Test
    public void testCreateMathTestResults() {
        TestResults t = new MathTestResults();
        assertEquals(0, t.getNumberOfScores());
    }

    @Test
    public void addScoreTest() {
        TestResults t = new MathTestResults();
        t.addScore("John", 10);
        t.addScore("Will", 2);
        t.addScore("David", 3);
        t.addScore("Jun", 20);
        assertEquals(4, t.getNumberOfScores());
    }


    @Test
    public void getNumberOfScoreTest() {
        TestResults t = new MathTestResults();
        t.addScore("John", 50);
        t.addScore("Will", 40);
        t.addScore("David", 40);
        assertEquals(3, t.getNumberOfScores());
    }

    @Test
    public void getMaximumNumTest() {
        TestResults t = new MathTestResults();
        t.addScore("John", 50);
        t.addScore("Will", 30);
        t.addScore("David", 100);
        assertEquals(100, t.getMaximumScore());
    }

    @Test
    public void getMaximumNumTest2() {
        TestResults t = new MathTestResults();
        assertEquals(0, t.getMaximumScore());
    }


    @Test
    public void getMinNumTest() {
        TestResults t = new MathTestResults();
        t.addScore("John", 30);
        t.addScore("Will", 10);
        t.addScore("David", 20);
        assertEquals(10, t.getMinimumScore());
    }

    @Test
    public void getMinNumTest2() {
        TestResults t = new MathTestResults();
        assertEquals(0, t.getMinimumScore());
    }

    @Test
    public void getMeanNumTest() {
        TestResults t = new MathTestResults();
        t.addScore("John", 50);
        t.addScore("Will", 50);
        t.addScore("David", 50);
        assertEquals(50, t.getMeanScore());
    }

    @Test
    public void getMeanNumTest2() {
        TestResults t = new MathTestResults();
        assertEquals(0, t.getMeanScore());
    }

    @Test
    public void getStudentWithMax() {
        TestResults t = new MathTestResults();
        t.addScore("John", 100);
        t.addScore("Will", 30);
        t.addScore("David", 50);
        t.getMaximumScore();
        assertEquals("John", t.getStudentWithMaximumScore());
    }

    @Test
    public void getStudentWithMax2() {
        TestResults t = new MathTestResults();
        assertNull(t.getStudentWithMaximumScore());
    }

    @Test
    public void getFailedStudentsTest() {
        TestResults t = new MathTestResults();
        t.addScore("John", 50);
        t.addScore("Will", 40);
        t.addScore("David", 40);
        assertArrayEquals(new String[]{}, t.getFailedStudents(30));
    }

    @Test
    public void getFailedStudentsTest2() {
        TestResults t = new MathTestResults();
        t.addScore("John", 0);
        t.addScore("Will", 10);
        t.addScore("David", 20);
        assertArrayEquals(new String[]{"John", "Will", "David"}, t.getFailedStudents(30));
    }
}
