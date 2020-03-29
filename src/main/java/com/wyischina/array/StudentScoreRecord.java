package com.wyischina.array;

import com.wyischina.oop.Student;

public class StudentScoreRecord {
    private String studentName;
    private int score;

    public StudentScoreRecord(String studentName, int score){
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public int getScore(){
        return this.score;
    }
}
