package com.example.javaassignment1200524341.Controllers;

import com.example.javaassignment1200524341.Utilities.DBUtility;
import com.example.javaassignment1200524341.Utilities.SceneChanger;
import com.example.javaassignment1200524341.Model.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentTableController implements Initializable {


    @FXML
    private TableView<Student> tableView;

    @FXML
    private TableColumn<Student, String> ethnicGColumn;

    @FXML
    private TableColumn<Student, String> firstChildColumn;

    @FXML
    private TableColumn<Student, String> genderColumn;

    @FXML
    private TableColumn<Student, Integer> idColumn;

    @FXML
    private TableColumn<Student, String> lunchColumn;

    @FXML
    private TableColumn<Student, Integer> mathColumn;

    @FXML
    private TableColumn<Student, String> parentMarStatusColumn;

    @FXML
    private TableColumn<Student, Integer> readingColumn;

    @FXML
    private TableColumn<Student, Integer> siblingsColumn;

    @FXML
    private TableColumn<Student, Integer> sportColumn;

    @FXML
    private TableColumn<Student, String> testPrepColumn;

    @FXML
    private Label topLable;

    @FXML
    private TableColumn<Student, String> transportColumn;

    @FXML
    private TableColumn<Student, Integer> writingColumn;

    /**
     * Changes scene to charts view
     * @param event
     * @throws IOException
     */
    @FXML
    void toChartTableChanger(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "student-chart-view.fxml", "Chart View");
    }

    /**
     * Sets the columns in the table, invokes the method which gets data from the database
     * And adds it to the table
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
        ethnicGColumn.setCellValueFactory(new PropertyValueFactory<>("ethnicGroup"));
        lunchColumn.setCellValueFactory(new PropertyValueFactory<>("lunchType"));
        testPrepColumn.setCellValueFactory(new PropertyValueFactory<>("testPrep"));
        parentMarStatusColumn.setCellValueFactory(new PropertyValueFactory<>("parentMaritalStatus"));
        sportColumn.setCellValueFactory(new PropertyValueFactory<>("practiceSport"));
        firstChildColumn.setCellValueFactory(new PropertyValueFactory<>("isFirstChild"));
        siblingsColumn.setCellValueFactory(new PropertyValueFactory<>("nrSiblings"));
        transportColumn.setCellValueFactory(new PropertyValueFactory<>("transportMeans"));
        mathColumn.setCellValueFactory(new PropertyValueFactory<>("mathScore"));
        readingColumn.setCellValueFactory(new PropertyValueFactory<>("readingScore"));
        writingColumn.setCellValueFactory(new PropertyValueFactory<>("writingScore"));

        tableView.getItems().addAll(DBUtility.retrieveStudentsFromDB());
    }
}
