package com.example.javaassignment1200524341.Model;

import java.util.Arrays;
import java.util.List;

public class Student {
    private int studentID, mathScore, readingScore, writingScore, nrSiblings;
    private String gender, ethnicGroup, lunchType, testPrep, parentMaritalStatus, practiceSport, isFirstChild, transportMeans;

    /**
     * Constructor which sets the values
     * @param studentID
     * @param gender
     * @param ethnicGroup
     * @param lunchType
     * @param testPrep
     * @param parentMaritalStatus
     * @param practiceSport
     * @param isFirstChild
     * @param nrSiblings
     * @param transportMeans
     * @param mathScore
     * @param readingScore
     * @param writingScore
     */
    public Student(int studentID, String gender, String ethnicGroup, String lunchType, String testPrep, String parentMaritalStatus, String practiceSport, String isFirstChild, int nrSiblings, String transportMeans, int mathScore, int readingScore, int writingScore) {
        setStudentID(studentID);
        setMathScore(mathScore);
        setReadingScore(readingScore);
        setWritingScore(writingScore);
        setNrSiblings(nrSiblings);
        setGender(gender);
        setEthnicGroup(ethnicGroup);
        setLunchType(lunchType);
        setTestPrep(testPrep);
        setParentMaritalStatus(parentMaritalStatus);
        setPracticeSport(practiceSport);
        setIsFirstChild(isFirstChild);
        setTransportMeans(transportMeans);
    }

    /**
     * Returns value
     * @return studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Sets the studentID value
     * Only possible values are: integers bigger than 0
     * @param studentID
     */
    public void setStudentID(int studentID) {
        if (studentID >= 0) {
            this.studentID = studentID;
        }
        else {
            throw new IllegalArgumentException("studentID can only be an integer number which is more or equal to 0");
        }
    }

    /**
     * Returns value
     * @return mathScore
     */
    public int getMathScore() {
        return mathScore;
    }

    /**
     * Sets the mathScore value
     * Only possible values are: integers between 0 and 100 (including both)
     * @param mathScore
     */
    public void setMathScore(int mathScore) {
        if (mathScore >= 0 && mathScore <= 100) {
            this.mathScore = mathScore;
        }
        else {
            throw new IllegalArgumentException("mathScore can only be an integer number between 0 and 100 (including both)");
        }
    }

    /**
     * Returns value
     * @return readingScore
     */
    public int getReadingScore() {
        return readingScore;
    }

    /**
     * Sets the readingScore value
     * Only possible values are: integers between 0 and 100 (including both)
     * @param readingScore
     */
    public void setReadingScore(int readingScore) {
        if (readingScore >= 0 && readingScore <= 100) {
            this.readingScore = readingScore;
        }
        else {
            throw new IllegalArgumentException("readingScore can only be an integer number between 0 and 100 (including both)");
        }
    }

    /**
     * Returns value
     * @return writingScore
     */
    public int getWritingScore() {
        return writingScore;
    }

    /**
     * Sets the writingScore value
     * Only possible values are: integers between 0 and 100 (including both)
     * @param writingScore
     */
    public void setWritingScore(int writingScore) {
        if (writingScore >= 0 && writingScore <= 100) {
            this.writingScore = writingScore;
        }
        else {
            throw new IllegalArgumentException("writingScore can only be an integer number between 0 and 100 (including both)");
        }
    }

    /**
     * Returns value
     * @return nrSiblings
     */
    public int getNrSiblings() {
        return nrSiblings;
    }

    /**
     * Sets the nrSiblings value
     * Only possible values are: integers bigger than 0
     * @param nrSiblings
     */
    public void setNrSiblings(int nrSiblings) {
        if (nrSiblings >= 0) {
            this.nrSiblings = nrSiblings;
        }
        else {
            throw new IllegalArgumentException("nrSiblings can only be an integer number which is more or equal to 0");
        }
    }

    /**
     * Returns value
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender value
     * Only possible values are: 'female', or 'male'
     * @param gender
     */
    public void setGender(String gender) {
        if (gender.equals("female     ") || gender.equals("male")) {
            this.gender = gender;
        }
        else {
            throw new IllegalArgumentException("gender can only be 'female     ', or 'male'");
        }
    }

    /**
     * Returns value
     * @return ethnicGroup
     */
    public String getEthnicGroup() {
        return ethnicGroup;
    }

    /**
     * Sets the ethnicGroup value
     * Only possible values are: 'group A', 'group B', 'group C', 'group D' or 'group E'
     * @param ethnicGroup
     */
    public void setEthnicGroup(String ethnicGroup) {
        if (ethnicGroup.equals("group A") || ethnicGroup.equals("group B") || ethnicGroup.equals("group C") || ethnicGroup.equals("group D") || ethnicGroup.equals("group E")) {
            this.ethnicGroup = ethnicGroup;
        }
        else {
            throw new IllegalArgumentException("ethnicGroup can only be 'group A', 'group B', 'group C', 'group D' or 'group E'");
        }

    }

    /**
     * Returns value
     * @return lunchType
     */
    public String getLunchType() {
        return lunchType;
    }

    /**
     * Sets the lunchType value
     * Only possible values are: 'free/reduced' or 'standard'
     * @param lunchType
     */
    public void setLunchType(String lunchType) {
        if (lunchType.equals("free/reduced") || lunchType.equals("standard")) {
            this.lunchType = lunchType;
        }
        else {
            throw new IllegalArgumentException("lunchType can only be 'free/reduced' or 'standard'");
        }
    }

    /**
     * Returns value
     * @return testPrep
     */
    public String getTestPrep() {
        return testPrep;
    }

    /**
     * Sets the testPrep value
     * Only possible values are: 'completed' or 'none'
     * @param testPrep
     */
    public void setTestPrep(String testPrep) {
        if (testPrep.equals("completed") || testPrep.equals("none")) {
            this.testPrep = testPrep;
        }
        else {
            throw new IllegalArgumentException("testPrep can only be 'completed' or 'none'");
        }
    }

    /**
     * Returns value
     * @return parentMaritalStatus
     */
    public String getParentMaritalStatus() {
        return parentMaritalStatus;
    }

    /**
     * Sets the parentMaritalStatus value
     * Only possible values are: 'single', 'married', 'divorced' or 'widowed'
     * @param parentMaritalStatus
     */
    public void setParentMaritalStatus(String parentMaritalStatus) {
        if (parentMaritalStatus.equals("single") || parentMaritalStatus.equals("married") || parentMaritalStatus.equals("divorced") || parentMaritalStatus.equals("widowed")) {
            this.parentMaritalStatus = parentMaritalStatus;
        }
        else {
            throw new IllegalArgumentException("parentMaritalStatus can only be 'single', 'married', 'divorced' or 'widowed'");
        }
    }

    /**
     * Returns value
     * @return practiceSport
     */
    public String getPracticeSport() {
        return practiceSport;
    }

    /**
     * Sets the practiceSport value
     * Only possible values are: 'regularly', 'sometimes' or 'never'
     * @param practiceSport
     */
    public void setPracticeSport(String practiceSport) {
        if (practiceSport.equals("regularly") || practiceSport.equals("sometimes") || practiceSport.equals("never")) {
            this.practiceSport = practiceSport;
        }
        else {
            throw new IllegalArgumentException("practiceSport can only be 'regularly', 'sometimes' or 'never'");
        }
    }

    /**
     * Returns value
     * @return isFirstChild
     */
    public String getIsFirstChild() {
        return isFirstChild;
    }

    /**
     * Sets the isFirstChild value
     * Only possible values are: 'yes' or 'no'
     * @param isFirstChild
     */
    public void setIsFirstChild(String isFirstChild) {
        if (isFirstChild.equals("yes     ") || isFirstChild.equals("no")) {
            this.isFirstChild = isFirstChild;
        }
        else {
            throw new IllegalArgumentException("isFirstChild can only be 'yes     ' or 'no'");
        }
    }

    /**
     * Returns value
     * @return transportMeans
     */
    public String getTransportMeans() {
        return transportMeans;
    }

    /**
     * Sets the transport means value
     * Only possible values are: 'school bus' or 'private'
     * @param transportMeans
     */
    public void setTransportMeans(String transportMeans) {
        if (transportMeans.equals("school bus") || transportMeans.equals("private")) {
            this.transportMeans = transportMeans;
        }
        else {
            throw new IllegalArgumentException("Transport means can only be 'school bus' or 'private'");
        }
    }

    /**
     * Returns the list of chart categories
     * @return
     */
    public static List<String> findAllDescriptions() {
        return Arrays.asList("Gender", "Ethnic Group", "Lunch Type", "Test Preparation", "Parent Marital Status", "Practice Sport", "Is First Child", "Number of Siblings", "Transport Means", "Exam Scores");
    }
}
