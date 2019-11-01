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
        for(int i = 0; i < currentIndex; i++){
            //max = Math.max(allScores[i].score,allScores[i+1].score);
            if(allScores[i].score > max){
                max = allScores[i].score;
            }
        }
        return max;
    }

    @Override
    public int getMinimumScore() {
        int min = 101;
        for(int i = 0; i < currentIndex; i++){
            //min = Math.min(allScores[i].score,allScores[i+1].score);
            if(allScores[i].score < min){
                min = allScores[i].score;
            }
        }
        return min;
    }

    @Override
    public int getMeanScore() {
        int totalScoreValue = 0;

        for(int i = 0; i < currentIndex;i++){
            totalScoreValue += allScores[i].score;
        }
        return totalScoreValue/currentIndex;
    }

    @Override
    public String getStudentWithMaximumScore() {
        int highestScore = -1;
        String highestScorer = "";

        for(int i = 0; i < currentIndex; i++){
            if(allScores[i].score > highestScore){
                highestScore = allScores[i].score;
                highestScorer = allScores[i].studentName;
            }
        }
        return highestScorer;
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        int failedStudentAmount = 0;
        for(int i = 0; i < currentIndex; i++){
            if(allScores[i].score < passScore){
                failedStudentAmount++;
            }
        }
        String[] failedStudents = new String[failedStudentAmount];

        for(int i = 0; i < currentIndex;i++){
            if(allScores[i].score < passScore){
                failedStudents[i] = allScores[i].studentName;
            }
        }
        return failedStudents;
    }
}
