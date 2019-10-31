package com.wyischina.array;

public class MathTestResults implements TestResults {

    Student[] student = new Student[0];

    public static Student[] addArray(Student[] list){
        Student[] newList = new Student[list.length + 1];
        for (int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        return newList;
    }

    @Override
    public void addScore(String studentName, int score) {
        this.student = addArray(this.student);
        this.student[this.student.length - 1] = new Student(score, studentName);
    }

    @Override
    public int getNumberOfScores() {
        return this.student.length;
    }

    @Override
    public int getMaximumScore() {
        int max = Math.max(student[0].getScore(), student[1].getScore());
        for (int i = 2; i < this.student.length; i++){
            max = Math.max(max, student[i].getScore());
        }
        return max;
    }

    @Override
    public int getMinimumScore() {
        int min = Math.min(student[0].getScore(), student[1].getScore());
        for (int i = 2; i < this.student.length; i++){
            min = Math.min(min, student[i].getScore());
        }
        return min;
    }

    @Override
    public int getMeanScore() {
        int add = 0;
        for (int i = 0; i < student.length; i++){
            add = add + student[i].getScore();
        }
        int mean = add / student.length;
        return mean;
    }

    @Override
    public String getStudentWithMaximumScore() {
        String a = null;
        int max = Math.max(student[0].getScore(), student[1].getScore());
        for (int i = 2; i < this.student.length; i++){
            max = Math.max(max, student[i].getScore());
        }
        for (int j = 0; j < this.student.length; j++){
            if (student[j].getScore() == max){
                a = student[j].getName();
            }
        }
        return a;
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        int counter = 0;
        for (int i = 0; i < this.student.length; i++){
            if (student[i].getScore() < passScore){
                counter++;
            }
        }
        int a = 0;
        String[] Stupids = new String[counter];
        for (int i = 0; i < this.student.length; i++){
            if (student[i].getScore() < passScore){
                Stupids[a] = student[i].getName();
                a++;
            }
        }
        return Stupids;
    }
}
