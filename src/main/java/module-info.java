module com.example.cattlemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cattlemanagementsystem to javafx.fxml;
    exports com.example.cattlemanagementsystem;
}