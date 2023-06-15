package com.example.javaassignment1200524341;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentChartController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private ComboBox<String> categoriesComboBox;

    @FXML
    private CategoryAxis categoryAxis;

    @FXML
    private NumberAxis numberAxis;

    /**
     * Changes the scene to the table view
     * @param event
     * @throws IOException
     */
    @FXML
    void tableViewButton(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "student-table-view.fxml", "Table View");
    }

    /**
     * Outputs the chart based on the user's choice from the combo box
     * @param event
     */
    @FXML
    void categoriesClick(ActionEvent event) {
        switch (categoriesComboBox.getSelectionModel().getSelectedItem()) {
            case "Gender":
                barChart.getData().clear();
                categoryAxis.setLabel("Genders");
                numberAxis.setLabel("Number of People");
                barChart.getData().addAll(DBUtility.findGenderNum());
                break;
            case "Ethnic Group":
                barChart.getData().clear();
                categoryAxis.setLabel("Ethnic Groups");
                numberAxis.setLabel("Number of People");
                barChart.getData().addAll(DBUtility.findEthnicGroupNum());
                break;
            case "Lunch Type":
                barChart.getData().clear();
                categoryAxis.setLabel("Lunch Types");
                numberAxis.setLabel("Number Ordered by People");
                barChart.getData().addAll(DBUtility.findLunchTypeNum());
                break;
            case "Test Preparation":
                barChart.getData().clear();
                categoryAxis.setLabel("Test Preparation Quality");
                numberAxis.setLabel("Number of People");
                barChart.getData().addAll(DBUtility.findTestPrepNum());
                break;
            case "Parent Marital Status":
                barChart.getData().clear();
                categoryAxis.setLabel("Parent Marital Status");
                numberAxis.setLabel("Number of People");
                barChart.getData().addAll(DBUtility.findParentMaritalStatusNum());
                break;
            case "Practice Sport":
                barChart.getData().clear();
                categoryAxis.setLabel("Practice Sport");
                numberAxis.setLabel("Number of People");
                barChart.getData().addAll(DBUtility.findPracticeSportNum());
                break;
            case "Is First Child":
                barChart.getData().clear();
                categoryAxis.setLabel("Is First Child");
                numberAxis.setLabel("Number of People");
                barChart.getData().addAll(DBUtility.findIsFirstChildNum());
                break;
            case "Number of Siblings":
                barChart.getData().clear();
                categoryAxis.setLabel("Number of Siblings");
                numberAxis.setLabel("Number of People");
                barChart.getData().addAll(DBUtility.findNrSiblingsNum());
                break;
            case "Transport Means":
                barChart.getData().clear();
                categoryAxis.setLabel("Transport Means");
                numberAxis.setLabel("Number of People");
                barChart.getData().addAll(DBUtility.findTransportMeansNum());
                break;
            case "Exam Scores":
                barChart.getData().clear();
                categoryAxis.setLabel("Exam Scores");
                numberAxis.setLabel("Average Grade");
                barChart.getData().addAll(DBUtility.findExamScoresNum());
                break;
            default:
                System.out.println("You should not get this notification. Something is wrong with the code");
                break;
        }
    }

    /**
     * Loads the combo box with the list of chart categories from the Student class
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        categoriesComboBox.getItems().addAll(Student.findAllDescriptions());
    }
}