package com.example.javaassignment1200524341;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    /**
     * Loads the table view scene
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("views/student-table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Student Info");
        stage.getIcons().add(new Image("file:src/main/resources/com/example/javaassignment1200524341/images/student-holding-book-and-pen.jpg"));
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Launches the program
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}