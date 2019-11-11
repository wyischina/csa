package com.wyischina.array;

import java.util.Scanner;

public class MathTestResults {
    int n = 10;
    private String [] studentName = new String[n];
    private int [] studentScore = new int [n];
    private int numberOfStudent;
    int maximumScore = 0;


    public void addScore(String studentName, int studentScore){
        if(numberOfStudent == n) {
            String[] storage = new String[n];
            for (int i = 0; i < n; i++) {
                storage[i] = this.studentName[i];
            }

            this.studentName = new String[n + 10];
            n = n + 10;
            for (int i = 0; i < n; i++) {
                this.studentName[i] = storage[i];
            }
        }
        this.studentName[numberOfStudent] = studentName;


        if(numberOfStudent == n){
            int[] storage = new int[n];
            for (int i = 0; i < n; i++){
                storage [i] = this.studentScore[i];
            }

            this.studentScore = new int[n];
            for (int i = 0; i < n; i++){
                this.studentScore[i] = storage[i];
            }
        }
        this.studentScore[numberOfStudent] = studentScore;
        numberOfStudent++;
    }

    public int getNumberOfScores(){
        return numberOfStudent;
    }

    public int getMaximumScore(){
        for (int i = 0; i < numberOfStudent; i++){
            if(studentScore[i]>maximumScore){
                maximumScore = studentScore[i];
            }
        }
        return maximumScore;
    }

    public int getMinimumScore(){
        int minimumScore = studentScore[0];
        for (int i = 0; i < numberOfStudent; i++){
            if(studentScore[i] < minimumScore){
                minimumScore = studentScore[i];
            }
        }
        return minimumScore;
    }

    public int getMeanScore(){
        int meanScore;
        int totalScore = 0;
        for (int i = 0; i < numberOfStudent; i++){
            totalScore += studentScore[i];
        }
        return meanScore = totalScore / numberOfStudent;
    }

    public String getStudentWithMaximumScore(){
        String studentWithMaximumScore = null;
        for (int i = 0; i < numberOfStudent; i++){
            if(studentScore[i] == maximumScore){
                studentWithMaximumScore = studentName[i];
            }
        }
        return studentWithMaximumScore;
    }

    public String[] getFailedStudents(int passScore){
        String[] failedStudents = new String[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++){
            if(studentScore [i] < passScore){
                failedStudents[i] = studentName[i];
            }
        }
        return failedStudents;
    }

}
