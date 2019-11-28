package com.wyischina.array;

public class MathTestResults implements TestResults {
    private int assumption = 10;
    private String[] studentNames = new String[assumption];
    private int[] studentScores = new int[assumption];
    private int numberOfStudents;


    @Override
    public void addScore(String studentName, int score) {
        numberOfStudents++;
        if(numberOfStudents<assumption){
            studentNames[numberOfStudents-1]=studentName;
        } else{
            String[] a = studentNames;
            studentNames = new String[assumption+10];
            assumption=assumption+10;
            for(int i =0;i<numberOfStudents; i++){
                studentNames[i]= a[i];
            }
        }

        if(numberOfStudents<assumption){
            studentScores[numberOfStudents-1]=score;
        } else {
            int[] b = studentScores;
            studentScores = new int[assumption+10];
            assumption=assumption+10;
            for(int i =0;i<numberOfStudents; i++){
                studentScores[i]= b[i];
            }
        }
    }

    @Override
    public int getNumberOfScores() {
        return numberOfStudents;
    }

    @Override
    public int getMaximumScore() {
        int maximumScore=0;
        int saveStudentNumber=0;
        for(int i = 0; i<numberOfStudents; i++) {
            if (studentScores[i] > maximumScore) {
                maximumScore = studentScores[i];
                saveStudentNumber=i;
            }
        }
        return maximumScore;
    }

    @Override
    public int getMinimumScore(){
        int minimumScore=studentScores[0];
        for(int i = 0; i<numberOfStudents; i++){
            if(studentScores[i]<minimumScore){
                minimumScore=studentScores[i];
            }
        }
        return minimumScore;
    }

    @Override
    public int getMeanScore() {
        int total=0;
        for(int i=0; i<numberOfStudents; i++){
            total=total+studentScores[i];
        }
         int meanScore = total/numberOfStudents;
        return meanScore;
    }

    @Override
    public String getStudentWithMaximumScore() {
        int maximumScore=0;
        int saveStudentNumber=0;
        for(int i = 0; i<numberOfStudents; i++) {
            if (studentScores[i] > maximumScore) {
                maximumScore = studentScores[i];
                saveStudentNumber=i;
            }
        }
        return studentNames[saveStudentNumber];
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        int totalAmountFailed = 0;
        String[] failedStudents;
        int fStudentNumber=0;
        for(int i = 0; i<numberOfStudents; i++){
            if(studentScores[i]<passScore){
                totalAmountFailed++;
            }
        }
        failedStudents = new String[totalAmountFailed];
        for (int i = 0; i<numberOfStudents;i++){
            if(studentScores[i]<passScore){
                failedStudents[fStudentNumber]=studentNames[i];
                fStudentNumber++;
            }
        }
        return failedStudents;
    }
}
