package com.wyischina.array;

public class MathTestResults implements TestResults {

    int index = 0;
    int[] result = new int[10];
    String[] name = new String[10];

    @Override
    public void addScore(String studentName, int score) {
        name[index] = studentName;
        result[index] = score;
        index++;
    }

    @Override
    public int getNumberOfScores() {
        return index;
    }

    @Override
    public int getMaximumScore() {
        int max = Math.max(result[0], result[1]);
        for (int i = 2; i < index; i++) {
            max = Math.max(max, result[i]);
        }
        return max;
    }

    @Override
    public int getMinimumScore() {
        int min = Math.min(result[0], result[1]);;
        for (int i = 2; i < index; i++) {
            min = Math.min(min, result[i]);
        }
        return min;
    }

    @Override
    public int getMeanScore() {
        int average = result[0] + result[1];
        for (int i = 2; i < index; i++) {
            average = average + result [i];
        }
        return average/index;
    }

    @Override
    public String getStudentWithMaximumScore() {
        int max = 0;
        int studentMax = 0;
        for (int i = 0; i < index; i++) {
            if (result[i] > max) {
                max = result[i];
                studentMax = i;
            }
        }
        return name[studentMax];
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        int failStudentNum = 0;
        for (int i = 0; i < index; i++) {
            if (result[i] < passScore) {
                failStudentNum = failStudentNum +1;
            }
        }
        String[] stupids = new String[failStudentNum];
        int u = 0;
        for (int i = 0; i < index; i++) {
            if (result[i]< passScore){
                stupids[u] = name[i];
                u++;
            }
        }

        return stupids;
    }
}
