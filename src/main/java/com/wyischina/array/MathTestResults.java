package com.wyischina.array;

public class MathTestResults implements TestResults {

    public int currentIndex = 0;
    private String[] studentNames;
    private int[] studentScores;

    public MathTestResults() {
        int i = 10;
        studentNames = new String[i];
        studentScores = new int[i];
    }

    @Override
    public void addScore(String studentName, int score) {

        studentNames[currentIndex] = studentName;
        studentScores[currentIndex] = score;

        currentIndex = currentIndex + 1;
    }

    @Override
    public int getNumberOfScores() {
        return currentIndex;
    }

    @Override
    public int getMaximumScore() {
        int max = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (studentScores[i] > max) {
                max = studentScores[i];
            }
        }
        return max;
    }

    @Override
    public int getMinimumScore() {
        int min = 100;
        for (int i = 0; i < currentIndex; i++) {
            if (studentScores[i] < min) {
                min = studentScores[i];
            }
        }
        if(studentScores[0] == 0){
            return 0;
        }
        return min;
    }

    @Override
    public int getMeanScore() {
        int sum = 0;
        int mean;
        try {
            for (int i = 0; i < currentIndex; i++) {
                sum = sum + studentScores[i];
            }
            mean = sum / currentIndex;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            mean = 0;
        }
        return mean;
    }

    @Override
    public String getStudentWithMaximumScore() {
        int max = 0;
        int indexWithMaxIndex = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (studentScores[i] > max) {
                max = studentScores[i];
                indexWithMaxIndex = i;
            }
        }
        return studentNames[indexWithMaxIndex];
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        int failedStudents = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (studentScores[i] < passScore) {
                failedStudents = failedStudents + 1;
            }
        }
        String[] autKids = new String[failedStudents];
        int prevIndex = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (studentScores[i] < passScore) {
                autKids[prevIndex] = studentNames[i];
                prevIndex++;
            }
        }
        return autKids;
    }
}
