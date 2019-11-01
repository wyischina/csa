package com.wyischina.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTestResultsTest {
    @Test
    public void testAddScore(){
        MathTestResults s = new MathTestResults();
        s.addScore("David",89);
        assertEquals(1,s.getNumberOfScores());
    }
    @Test
    public void testGetNumberOfScores(){
        MathTestResults s = new MathTestResults();
        s.addScore("Jun", 43);
        assertEquals(1,s.getNumberOfScores());
    }
    @Test
    public void testGetMaximumScore(){
        MathTestResults s = new MathTestResults();
        s.addScore("Nick", 90);
        s.addScore("Jun", 79);
        assertEquals(90,s.getMaximumScore());
    }
    @Test
    public void testGetMinimumScore(){
        MathTestResults s = new MathTestResults();
        s.addScore("Nick",89);
        s.addScore("Jun",95);
        assertEquals(89,s.getMinimumScore());
    }
    @Test
    public void testGetMeanScore(){
        MathTestResults s = new MathTestResults();
        s.addScore("Jun",30);
        s.addScore("Nick", 60);
        assertEquals(45,s.getMeanScore());
    }
    @Test
    public void testGetStudentWithMaximumScore(){
        MathTestResults s = new MathTestResults();
        s.addScore("Shawn", 69);
        s.addScore("David", 73);
        s.addScore("Andrew", 89);
        assertEquals("Andrew", s.getStudentWithMaximumScore());
    }
    @Test
    public void testGetFailedStudents(){
        MathTestResults s = new MathTestResults();
        s.addScore("Shawn", 69);
        s.addScore("David", 70);
        s.addScore("John", 71);
        assertArrayEquals(new String[] {"Shawn", "David"},s.getFailedStudents(71));
    }
}
