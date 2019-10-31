package com.wyischina.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTestResultsTest {

    @Test
    public void testConstructors() {
        TestResults testResults = new MathTestResults();
        assertEquals(0, testResults.getNumberOfScores());
    }

    @Test
    public void testAddScore() {
        TestResults testResults = new MathTestResults();
        testResults.addScore("Dawei", 0);
        testResults.addScore("one", 10);
        testResults.addScore("two", 20);
        assertEquals(3, testResults.getNumberOfScores());
    }

    @Test
    public void testAddScoreArrayExtension(){
        TestResults testResults = new MathTestResults();
        for(int i = 0; i < 20; i++){
            testResults.addScore("" + i, i * 10);
        }
        assertEquals(20, testResults.getNumberOfScores());
    }

    @Test
    public void testMaxScore(){
        TestResults testResults = new MathTestResults();
        for(int i = 0; i < 20; i++){
            if(i == 13){
                testResults.addScore("max", 1000);
            }
            testResults.addScore("" + i, i * 10);
        }
        assertEquals(1000, testResults.getMaximumScore());
    }

    @Test
    public void testMaxScoreStudent(){
        TestResults testResults = new MathTestResults();
        for(int i = 0; i < 20; i++){
            if(i == 13){
                testResults.addScore("max", 1000);
            }
            testResults.addScore("" + i, i * 10);
        }
        assertEquals("max", testResults.getStudentWithMaximumScore());
    }

    @Test
    public void testMinScore(){
        TestResults testResults = new MathTestResults();
        for(int i = 0; i < 20; i++){
            if(i == 13){
                testResults.addScore("min", -1);
            }
            testResults.addScore("" + i, i * 10);
        }
        assertEquals(-1, testResults.getMinimumScore());
    }

    @Test
    public void testMeanScore(){
        TestResults testResults = new MathTestResults();
        testResults.addScore("Sokol", 100);
        testResults.addScore("Lauron", 13);
        testResults.addScore("David", -1);
        testResults.addScore("Jun", 200);

        assertEquals(78, testResults.getMeanScore());
    }

    @Test
    public void testStupidStudents(){
        TestResults testResults = new MathTestResults();
        testResults.addScore("Sokol", 100);
        testResults.addScore("Lauron", 59);
        testResults.addScore("David", -1);
        testResults.addScore("Jun", 60);

        assertArrayEquals(new String[]{"Lauron","David"}, testResults.getFailedStudents(60));
    }
}
