package com.example.javaassignment1200524341;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {

    private static String user = "root";
    private static String pass = "123Imperial_123";

    private static String connectURL = "jdbc:mysql://localhost:3306/javaassign1";

    public static ArrayList<Student> retrieveStudentsFromDB(){
        ArrayList<Student> students = new ArrayList<>();
        String sql = "SELECT *\n" +
                "FROM studentinfo\n" +
                "GROUP BY StudentID;";

        // try with resource block
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaassign1", user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()){
                int studentID = resultSet.getInt("StudentID");
                String gender = resultSet.getString("Gender");
                String ethnicGroup = resultSet.getString("EthnicGroup");
                String lunchType = resultSet.getString("LunchType");
                String testPrep = resultSet.getString("TestPrep");
                String parentMaritalStatus = resultSet.getString("ParentMaritalStatus");
                String practiceSport = resultSet.getString("PracticeSport");
                String isFirstChild = resultSet.getString("IsFirstChild");
                int nrSiblings = resultSet.getInt("NrSiblings");
                String transportMeans = resultSet.getString("TransportMeans");
                int mathScore = resultSet.getInt("MathScore");
                int readingScore = resultSet.getInt("ReadingScore");
                int writingScore = resultSet.getInt("WritingScore");

                Student newStudent = new Student(studentID, gender, ethnicGroup, lunchType, testPrep, parentMaritalStatus, practiceSport, isFirstChild, nrSiblings, transportMeans, mathScore, readingScore, writingScore);
                students.add(newStudent);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }

}
