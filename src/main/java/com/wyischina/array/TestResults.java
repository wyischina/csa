package com.wyischina.array;

/**
 * An instance of a TestResults represent the test scores of a group of students in a single test.
 * It provides several methods for producing statistics of the test.
 */
public interface TestResults {

    /**
     * Add a score
     * @param studentName name of a student
     * @param score score the student has achieved in this test.
     */
    public void addScore(String studentName, int score);

    /**
     * Get the number of scores stored.
     * @return int the number of scores stored by calling {@link #addScore(String, int)}
     */
    public int getNumberOfScores();

    /**
     * Get the maximum score achieved in this test.
     * @return int the maximum score achieved in this test. Returns 0 if no score has been added.
     */
    public int getMaximumScore();

    /**
     * Get the minimum score achieved in this test.
     * @return int the minimum score achieved in this test. Returns 0 if no score has been added.
     */
    public int getMinimumScore();

    /**
     * Get the mean score achieved in this test.
     * @return int the mean score achieved in this test (rounded to the nearest integer).
     * Returns 0 if no score has been added.
     */
    public int getMeanScore();

    /**
     * Get the name of the student with the highest score in this test.
     * @return String the name of the student with the highest score achieved in this test (rounded to the nearest integer).
     * Returns null if no score has been added.
     */
    public String getStudentWithMaximumScore();

    /**
     * Get the names of students who have failed the test.
     * @param passScore the score above or equal which the student is considered a pass.
     * @return String[] An array of names of those students whose test score is lower than the pass score.
     */
    public String[] getFailedStudents(int passScore);

    public void removeScore(String studentName);

}
