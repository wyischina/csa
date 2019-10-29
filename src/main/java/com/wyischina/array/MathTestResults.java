package com.wyischina.array;

public class MathTestResults implements TestResults {

    @Override
    public void addScore(String studentName, int score) {

    }

    @Override
    public int getNumberOfScores() {
        return 0;
    }

    @Override
    public int getMaximumScore() {
        return 0;
    }

    @Override
    public int getMinimumScore() {
        return 0;
    }

    @Override
    public int getMeanScore() {
        return 0;
    }

    @Override
    public String getStudentWithMaximumScore() {
        return null;
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        return new String[0];
    }
}
