module com.example.javaassignment1200524341 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javaassignment1200524341 to javafx.fxml;
    exports com.example.javaassignment1200524341;
}