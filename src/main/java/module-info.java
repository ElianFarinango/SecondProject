module com.example.myfistproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfistproject to javafx.fxml;
    exports com.example.myfistproject;
}