module com.example.javaassignment1200524341 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javaassignment1200524341 to javafx.fxml;
    exports com.example.javaassignment1200524341;
    exports com.example.javaassignment1200524341.Controllers;
    opens com.example.javaassignment1200524341.Controllers to javafx.fxml;
    exports com.example.javaassignment1200524341.Utilities;
    opens com.example.javaassignment1200524341.Utilities to javafx.fxml;
    exports com.example.javaassignment1200524341.Model;
    opens com.example.javaassignment1200524341.Model to javafx.fxml;
}