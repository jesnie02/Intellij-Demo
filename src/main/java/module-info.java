module com.example.intellijdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intellijdemo to javafx.fxml;
    exports com.example.intellijdemo;
}