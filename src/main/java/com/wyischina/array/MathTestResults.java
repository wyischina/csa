package com.wyischina.array;

public class MathTestResults {

    String[] students = new String[5];
    int[] scores = new int[5];
    int currentIndex = 0;

    public void addScore(String studentName, int score) {
        students[currentIndex] = studentName;
        scores[currentIndex] = score;
        currentIndex++;
        if (currentIndex == students.length && currentIndex == scores.length) {
            int[] newScores = new int[currentIndex + 1];
            for (int i = 0; i < scores.length; i++) {
                newScores[i] = scores[i];
            }
            scores = newScores;
            String[] newNames = new String[currentIndex + 1];
            for (int i = 0; i < scores.length; i++) {
                newNames[i] = students[i];
            }
            students = newNames;
        }
    }


    public int getNumberOfScores() {
        return currentIndex;
    }


    public int getMaximumScore() {
        int max = scores[0];
        for (int i = 1; i < currentIndex; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }


    public int getMinimumScore() {
        int min = scores[0];
        for (int i = 1; i < currentIndex; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }


    public int getMeanScore() {
        int sum = 0;
        for (int i = 0; i < currentIndex; i++) {
            sum += scores[i];
        }
        if (currentIndex == 0) {
            return 0;
        }
        return sum / currentIndex;
    }


    public String getStudentWithMaximumScore() {
        int max = scores[0];
        int indexOfStudentWithMaxScore = 0;
        for (int i = 1; i < currentIndex; i++) {
            if (scores[i] > max) {
                max = scores[i];
                indexOfStudentWithMaxScore = i;
            }
        }
        return students[indexOfStudentWithMaxScore];
    }


    public String[] getFailedStudents(int passScore) {
        int amountFailed = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (scores[i] < passScore) {
                amountFailed++;
            }
        }
        String[] failedStudents = new String[amountFailed];
        int indexOfFailedStudent = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (scores[i] < passScore) {
                failedStudents[indexOfFailedStudent] = students[i];
                indexOfFailedStudent++;
            }
        }
        return failedStudents;
    }
}





