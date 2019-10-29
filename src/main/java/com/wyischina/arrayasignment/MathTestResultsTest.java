package com.wyischina.arrayasignment;

public class MathTestResultsTest {
    int numberOfStudents;
    int numberOfScores;

    String[] studentNames = new String[numberOfStudents+1];
    int[] studentScores = new int[numberOfScores+1];

    public void addScore(int n){
        studentScores[numberOfScores] = n;
        numberOfScores++;
    }



}
