package com.wyischina.array;

public class MathTestResults implements TestResults {
    private StudentScoreRecord[] studentScoreRecordArray = new StudentScoreRecord[10];
    private int currentIndex = 0;

    @Override
    public void addScore(String studentName, int score) {
        if(this.studentScoreRecordArray[this.studentScoreRecordArray.length-1] != null){
            StudentScoreRecord[] tempStudentScoreRecordArray = new StudentScoreRecord[this.studentScoreRecordArray.length+10];
            for(int i = 0; i < this.studentScoreRecordArray.length; i++){
                tempStudentScoreRecordArray[i] = this.studentScoreRecordArray[i];
            }
            this.studentScoreRecordArray = tempStudentScoreRecordArray;
        }
        this.studentScoreRecordArray[this.currentIndex] = new StudentScoreRecord(studentName, score);
        this.currentIndex++;
    }

    @Override
    public int getNumberOfScores() {
        return currentIndex;
    }

    @Override
    public int getMaximumScore() {
        int max = 0;
        for(int i = 1; i < currentIndex+1; i++){
            max = Math.max(studentScoreRecordArray[i-1].getScore(), studentScoreRecordArray[i].getScore());
        }
        return max;
    }

    @Override
    public int getMinimumScore() {
        int min = 0;
        for(int i = 1; i < currentIndex+1; i++){
            min = Math.min(studentScoreRecordArray[i-1].getScore(), studentScoreRecordArray[i].getScore());
        }
        return min;
    }

    @Override
    public int getMeanScore() {
        int total = 0;
        for(int i = 1; i < currentIndex+1; i++) {
            total += studentScoreRecordArray[i].getScore();
        }
        return total/(currentIndex);
    }

    @Override
    public String getStudentWithMaximumScore() {
        String bestStudent = null;
        for(int i = 0; i < currentIndex+1; i++) {
            if(studentScoreRecordArray[i].getScore() == getMaximumScore()){
                bestStudent = studentScoreRecordArray[i].getStudentName();
            }
        }
        return bestStudent;
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        int stupidAmount = 0;
        for(int i = 0; i < currentIndex+1; i++){
            if(studentScoreRecordArray[i].getScore() < passScore) {
                stupidAmount++;
            }
        }
        String[] stupidStudents = new String[stupidAmount];

        for(int i = 0; i < currentIndex+1; i++) {
            if(studentScoreRecordArray[i].getScore() < passScore){
                stupidStudents = new String[stupidStudents.length];
                stupidStudents[i] = studentScoreRecordArray[i].getStudentName();
            }
        }
        return stupidStudents;
    }
}
