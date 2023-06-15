package com.example.javaassignment1200524341;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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

    @FXML
    void tableViewButton(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "student-table-view.fxml", "Table View");
    }

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
                barChart.getData().addAll();
                break;
            case "Lunch Type":
                break;
            case "Test Preparation":
                break;
            case "Parent Marital Status":
                break;
            case "Practice Sport":
                break;
            case "Is First Child":
                break;
            case "Number of Siblings":
                break;
            case "Transport Means":
                break;
            case "Exam scores":
                break;
            default:
                System.out.println("Nothing interesting");
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        categoriesComboBox.getItems().addAll(Student.findAllDescriptions());
    }
}