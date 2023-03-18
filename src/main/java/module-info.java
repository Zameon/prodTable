module com.example.baal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.base;


    opens com.example.baal to javafx.fxml;
    exports com.example.baal;
}