package com.example.javaassignment1200524341;

import javafx.scene.chart.XYChart;

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
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
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

    public static ArrayList<XYChart.Series<String, Integer>> findGenderNum() {
        ArrayList<XYChart.Series<String, Integer>> gendersArray = new ArrayList<>();
        String sql = "SELECT count(gender) as numGender, gender from studentinfo\n" +
                     "GROUP BY gender;";
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()) {
                XYChart.Series<String, Integer> genders = new XYChart.Series<>();
                int genderNum = resultSet.getInt("numGender");
                String gender = resultSet.getString("gender");
                genders.setName(gender);
                XYChart.Data<String, Integer> genderBar = new XYChart.Data<>("", genderNum);
                genders.getData().add(genderBar);
                gendersArray.add(genders);
            }
            return gendersArray;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<XYChart.Series<String, Integer>> findEthnicGroupNum() {
        ArrayList<XYChart.Series<String, Integer>> ethnicGArray = new ArrayList<>();
        String sql = "SELECT count(ethnicGroup) as numEthnicG, ethnicGroup from studentinfo\n" +
                     "GROUP BY ethnicGroup;";
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()) {
                XYChart.Series<String, Integer> ethnicGroups = new XYChart.Series<>();
                int ethnicGNum = resultSet.getInt("numEthnicG");
                String ethnicGroup = resultSet.getString("ethnicGroup");
                ethnicGroups.setName(ethnicGroup);
                XYChart.Data<String, Integer> ethnicGBar = new XYChart.Data<>("", ethnicGNum);
                ethnicGroups.getData().add(ethnicGBar);
                ethnicGArray.add(ethnicGroups);
            }
            return ethnicGArray;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
