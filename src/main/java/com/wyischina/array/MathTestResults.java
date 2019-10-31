package com.wyischina.array;


public class MathTestResults implements TestResults {
    private StudentScore[] allScores = new StudentScore[10];
    private int currentIndex = 0;

    @Override
    public void addScore(String studentName, int score) {
        allScores[currentIndex] = new StudentScore(studentName, score);
        currentIndex++;
    }

    @Override
    public int getNumberOfScores() {
        return currentIndex;
    }

    @Override
    public int getMaximumScore() {
        int max = 0;
        for(int i = 0; i < allScores.length-1; i++){
            max = Math.max(allScores[i].score,allScores[i+1].score);
        }
        return max;
    }

    @Override
    public int getMinimumScore() {
        int min = 0;
        for(int i = 0; i < allScores.length-1; i++){
            min = Math.min(allScores[i].score,allScores[i+1].score);
        }
        return min;
    }

    @Override
    public int getMeanScore() {
        int meanScore = 0;
        int totalScoreValue = 0;
        int currentIndex = allScores.length-1;

        for(int i = 0; i < currentIndex;i++){
            totalScoreValue += allScores[i].score;
        }
        return totalScoreValue/currentIndex;
    }

    @Override
    public String getStudentWithMaximumScore() {
        int highestScore = -1;
        String highestScorer = "";

        for(int i = 0; i < allScores.length-1; i++){
            if(allScores[i].score > highestScore){
                highestScore = allScores[i].score;
                highestScorer = allScores[i].studentName;
            }
        }
        return highestScorer;
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        int n = 1;
        String[] failedStudents = new String[n];

        for(int i = 0; i < allScores.length-1;i++){
            if(allScores[i].score <= passScore){
                n++;
                failedStudents[n] = allScores[i].studentName;
            }
        }
        return failedStudents;
    }
}
