package com.example.javaassignment1200524341;

public class Student {
    private int StudentID, MathScore, ReadingScore, WritingScore, NrSiblings;
    private String Gender, EthnicGroup, LunchType, TestPrep, ParentMaritalStatus, PracticeSport, IsFirstChild, TransportMeans;

    public Student(int studentID, int mathScore, int readingScore, int writingScore, int nrSiblings, String gender, String ethnicGroup, String lunchType, String testPrep, String parentMaritalStatus, String practiceSport, String isFirstChild, String transportMeans) {
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
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    public int getReadingScore() {
        return ReadingScore;
    }

    public void setReadingScore(int readingScore) {
        ReadingScore = readingScore;
    }

    public int getWritingScore() {
        return WritingScore;
    }

    public void setWritingScore(int writingScore) {
        WritingScore = writingScore;
    }

    public int getNrSiblings() {
        return NrSiblings;
    }

    public void setNrSiblings(int nrSiblings) {
        NrSiblings = nrSiblings;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEthnicGroup() {
        return EthnicGroup;
    }

    public void setEthnicGroup(String ethnicGroup) {
        EthnicGroup = ethnicGroup;
    }

    public String getLunchType() {
        return LunchType;
    }

    public void setLunchType(String lunchType) {
        LunchType = lunchType;
    }

    public String getTestPrep() {
        return TestPrep;
    }

    public void setTestPrep(String testPrep) {
        TestPrep = testPrep;
    }

    public String getParentMaritalStatus() {
        return ParentMaritalStatus;
    }

    public void setParentMaritalStatus(String parentMaritalStatus) {
        ParentMaritalStatus = parentMaritalStatus;
    }

    public String getPracticeSport() {
        return PracticeSport;
    }

    public void setPracticeSport(String practiceSport) {
        PracticeSport = practiceSport;
    }

    public String getIsFirstChild() {
        return IsFirstChild;
    }

    public void setIsFirstChild(String isFirstChild) {
        IsFirstChild = isFirstChild;
    }

    public String getTransportMeans() {
        return TransportMeans;
    }

    public void setTransportMeans(String transportMeans) {
        TransportMeans = transportMeans;
    }
}
