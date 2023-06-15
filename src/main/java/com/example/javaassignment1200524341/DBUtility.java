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

    public static ArrayList<XYChart.Series<String, Integer>> findLunchTypeNum() {
        ArrayList<XYChart.Series<String, Integer>> lunchTypeArray = new ArrayList<>();
        String sql = "SELECT count(lunchtype) as numLunchType, lunchtype from studentinfo\n" +
                "GROUP BY lunchtype;";
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()) {
                XYChart.Series<String, Integer> lunchTypes = new XYChart.Series<>();
                int lunchtypeNum = resultSet.getInt("numLunchType");
                String lunchType = resultSet.getString("lunchtype");
                lunchTypes.setName(lunchType);
                XYChart.Data<String, Integer> lunchTypeBar = new XYChart.Data<>("", lunchtypeNum);
                lunchTypes.getData().add(lunchTypeBar);
                lunchTypeArray.add(lunchTypes);
            }
            return lunchTypeArray;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<XYChart.Series<String, Integer>> findTestPrepNum() {
        ArrayList<XYChart.Series<String, Integer>> testPrepArray = new ArrayList<>();
        String sql = "SELECT count(testprep) as numTestPrep, testprep from studentinfo\n" +
                "GROUP BY testprep;";
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()) {
                XYChart.Series<String, Integer> testPreps = new XYChart.Series<>();
                int testPrepNum = resultSet.getInt("numTestPrep");
                String testPrep = resultSet.getString("testprep");
                testPreps.setName(testPrep);
                XYChart.Data<String, Integer> testPrepBar = new XYChart.Data<>("", testPrepNum);
                testPreps.getData().add(testPrepBar);
                testPrepArray.add(testPreps);
            }
            return testPrepArray;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<XYChart.Series<String, Integer>> findParentMaritalStatusNum() {
        ArrayList<XYChart.Series<String, Integer>> parentMaritalStatusArray = new ArrayList<>();
        String sql = "SELECT count(parentmaritalstatus) as numParentMaritalStatus, parentmaritalstatus from studentinfo\n" +
                "GROUP BY parentmaritalstatus;";
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()) {
                XYChart.Series<String, Integer> parentMaritalStatuses = new XYChart.Series<>();
                int parentMaritalStatusNum = resultSet.getInt("numParentMaritalStatus");
                String parentMaritalStatus = resultSet.getString("parentmaritalstatus");
                parentMaritalStatuses.setName(parentMaritalStatus);
                XYChart.Data<String, Integer> parentMaritalStatusBar = new XYChart.Data<>("", parentMaritalStatusNum);
                parentMaritalStatuses.getData().add(parentMaritalStatusBar);
                parentMaritalStatusArray.add(parentMaritalStatuses);
            }
            return parentMaritalStatusArray;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<XYChart.Series<String, Integer>> findPracticeSportNum() {
        ArrayList<XYChart.Series<String, Integer>> practiceSportArray = new ArrayList<>();
        String sql = "SELECT count(practicesport) as numPracticeSport, practicesport from studentinfo\n" +
                "GROUP BY practicesport;";
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()) {
                XYChart.Series<String, Integer> practiceSports = new XYChart.Series<>();
                int practiceSportNum = resultSet.getInt("numPracticeSport");
                String practiceSport = resultSet.getString("practicesport");
                practiceSports.setName(practiceSport);
                XYChart.Data<String, Integer> practiceSportBar = new XYChart.Data<>("", practiceSportNum);
                practiceSports.getData().add(practiceSportBar);
                practiceSportArray.add(practiceSports);
            }
            return practiceSportArray;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<XYChart.Series<String, Integer>> findIsFirstChildNum() {
        ArrayList<XYChart.Series<String, Integer>> isFirstChildArray = new ArrayList<>();
        String sql = "SELECT count(isfirstchild) as numIsFirstChild, isfirstchild from studentinfo\n" +
                "GROUP BY isfirstchild;";
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()) {
                XYChart.Series<String, Integer> isFirstChildren = new XYChart.Series<>();
                int isFirstChildNum = resultSet.getInt("numIsFirstChild");
                String isFirstChild = resultSet.getString("isfirstchild");
                isFirstChildren.setName(isFirstChild);
                XYChart.Data<String, Integer> isFirstChildBar = new XYChart.Data<>("", isFirstChildNum);
                isFirstChildren.getData().add(isFirstChildBar);
                isFirstChildArray.add(isFirstChildren);
            }
            return isFirstChildArray;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<XYChart.Series<String, Integer>> findNrSiblingsNum() {
        ArrayList<XYChart.Series<String, Integer>> nrSiblingsArray = new ArrayList<>();
        String sql = "SELECT count(nrsiblings) as numNrSiblings, nrsiblings from studentinfo\n" +
                "GROUP BY nrsiblings;";
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next()) {
                XYChart.Series<String, Integer> nrsSiblings = new XYChart.Series<>();
                int nrSiblingsNum = resultSet.getInt("numNrSiblings");
                String nrSiblings = resultSet.getString("nrsiblings");
                nrsSiblings.setName(nrSiblings);
                XYChart.Data<String, Integer> nrSiblingsBar = new XYChart.Data<>("", nrSiblingsNum);
                nrsSiblings.getData().add(nrSiblingsBar);
                nrSiblingsArray.add(nrsSiblings);
            }
            return nrSiblingsArray;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
