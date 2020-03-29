package com.wyischina.array;

public class MathTestResults implements TestResults {
    private StudentScoreRecord[] studentScoreRecordArray = new StudentScoreRecord[10];
    //keeps track of how many times addScore() has been called
    private int currentIndex = 0;
    private int max = 0;
    private String studentMax;
    private int min = 0;
    private double mean = 0;

    @Override
    public void addScore(String studentName, int score) {
        //check whether the list is full
        if(this.studentScoreRecordArray[this.studentScoreRecordArray.length-1] != null){
            //create temporary array
            StudentScoreRecord[] tempStudentScoreRecordArray = new StudentScoreRecord[this.studentScoreRecordArray.length+10];
            //loops through every value in the main array and assign each one to its corresponding position in the temporary array
            System.arraycopy(this.studentScoreRecordArray, 0, tempStudentScoreRecordArray, 0, this.studentScoreRecordArray.length);
            //assigns the temporary array to the man array
            this.studentScoreRecordArray = tempStudentScoreRecordArray;
        }
        this.studentScoreRecordArray[this.currentIndex] = new StudentScoreRecord(studentName, score);

        //find max student
        if (this.max < score){
            this.studentMax = studentName;
        }
        //find max
        this.max = Math.max(this.max, score);
        //find min
        this.min = Math.min(this.min, score);
        //find mean
        if(currentIndex == 0){
            this.mean = score;
        } else {
            this.mean = (score + (mean*currentIndex)) / (double)(currentIndex+1);
        }



        this.currentIndex++;
    }

    @Override
    public int getNumberOfScores() {
        return currentIndex;
    }

    @Override
    public int getMaximumScore() {
        return max;
    }

    @Override
    public int getMinimumScore() {
        return min;
    }

    @Override
    public int getMeanScore() {
        if(mean - (int)mean >= 0.5){
            return (int)(mean + 0.5);
        }
        else{
            return (int)mean;
        }
    }

    @Override
    public String getStudentWithMaximumScore() {
        return studentMax;
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

    public void removeScore(String studentName){
        int removalIndex = 0;
        for(StudentScoreRecord studentScoreRecord: studentScoreRecordArray){
            if(studentScoreRecord != null && studentScoreRecord.getStudentName().equals(studentName)) {
                break;
            }
            removalIndex++;
        }

        for(int i = removalIndex; i < currentIndex; i++){
            studentScoreRecordArray[removalIndex-1] = studentScoreRecordArray[removalIndex];
        }

        currentIndex--;
    }
}
