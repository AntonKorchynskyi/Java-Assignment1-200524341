package com.example.javaassignment1200524341.Utilities;

import com.example.javaassignment1200524341.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {

    /**
     * Changes the Scene
     * @param actionEvent
     * @param fxmlFileName
     * @param viewTitle
     * @throws IOException
     */
    public static void changeScenes(ActionEvent actionEvent, String fxmlFileName, String viewTitle) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("views/" + fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle(viewTitle);
        stage.setScene(scene);
        stage.show();
    }
}