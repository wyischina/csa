package com.wyischina.array;

public class MathTestResults implements TestResults {
    private StudentScoreRecord[] studentScoreRecordArray = new StudentScoreRecord[10];
    //keeps track of how many times addScore() has been called
    private int currentIndex = 0;

    @Override
    public void addScore(String studentName, int score) {
        //check whether the list is full
        if(this.studentScoreRecordArray[this.studentScoreRecordArray.length-1] != null){
            //create temporary array
            StudentScoreRecord[] tempStudentScoreRecordArray = new StudentScoreRecord[this.studentScoreRecordArray.length+10];
            //loops through every value in the main array and assign each one to its corresponding position in the temporary array
            for(int i = 0; i < this.studentScoreRecordArray.length; i++){
                tempStudentScoreRecordArray[i] = this.studentScoreRecordArray[i];
            }
            //assigns the temporary array to the man array
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
        int max = Math.max(studentScoreRecordArray[0].getScore(), studentScoreRecordArray[1].getScore());
        for(int i = 1; i < currentIndex; i++){
            max = Math.max(max, studentScoreRecordArray[i].getScore());
        }
        return max;
    }

    @Override
    public int getMinimumScore() {
        int min = Math.min(studentScoreRecordArray[0].getScore(), studentScoreRecordArray[1].getScore());
        for(int i = 1; i < currentIndex; i++){
            min = Math.min(min, studentScoreRecordArray[i].getScore());
        }
        return min;
    }

    @Override
    public int getMeanScore() {
        int total = 0;
        for(int i = 0; i < currentIndex; i++) {
            total += studentScoreRecordArray[i].getScore();
        }
        return total/(currentIndex);
    }

    @Override
    public String getStudentWithMaximumScore() {
        String bestStudent = null;
        int max = getMaximumScore();
        for(int i = 0; i < currentIndex; i++) {
            if(studentScoreRecordArray[i].getScore() == max){
                bestStudent = studentScoreRecordArray[i].getStudentName();
            }
        }
        return bestStudent;
    }

    @Override
    public String[] getFailedStudents(int passScore) {
        //calculates the amount of failed students
        int stupidAmount = 0;
        for(int i = 0; i < currentIndex; i++){
            if(studentScoreRecordArray[i].getScore() < passScore) {
                stupidAmount++;
            }
        }
        //put the students who failed into a list
        String[] stupidStudents = new String[stupidAmount];
        int tempIndex = 0;
        for(int i = 0; i < currentIndex; i++) {
            if(studentScoreRecordArray[i].getScore() < passScore){
                stupidStudents[tempIndex] = studentScoreRecordArray[i].getStudentName();
                tempIndex++;
            }
        }
        return stupidStudents;
    }
}
