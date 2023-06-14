package com.example.javaassignment1200524341;

public class Student {
    private int studentID, mathScore, readingScore, writingScore, nrSiblings;
    private String gender, ethnicGroup, lunchType, testPrep, parentMaritalStatus, practiceSport, isFirstChild, transportMeans;

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

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getReadingScore() {
        return readingScore;
    }

    public void setReadingScore(int readingScore) {
        this.readingScore = readingScore;
    }

    public int getWritingScore() {
        return writingScore;
    }

    public void setWritingScore(int writingScore) {
        this.writingScore = writingScore;
    }

    public int getNrSiblings() {
        return nrSiblings;
    }

    public void setNrSiblings(int nrSiblings) {
        this.nrSiblings = nrSiblings;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicGroup() {
        return ethnicGroup;
    }

    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public String getLunchType() {
        return lunchType;
    }

    public void setLunchType(String lunchType) {
        this.lunchType = lunchType;
    }

    public String getTestPrep() {
        return testPrep;
    }

    public void setTestPrep(String testPrep) {
        this.testPrep = testPrep;
    }

    public String getParentMaritalStatus() {
        return parentMaritalStatus;
    }

    public void setParentMaritalStatus(String parentMaritalStatus) {
        this.parentMaritalStatus = parentMaritalStatus;
    }

    public String getPracticeSport() {
        return practiceSport;
    }

    public void setPracticeSport(String practiceSport) {
        this.practiceSport = practiceSport;
    }

    public String getIsFirstChild() {
        return isFirstChild;
    }

    public void setIsFirstChild(String isFirstChild) {
        this.isFirstChild = isFirstChild;
    }

    public String getTransportMeans() {
        return transportMeans;
    }

    public void setTransportMeans(String transportMeans) {
        this.transportMeans = transportMeans;
    }
}
