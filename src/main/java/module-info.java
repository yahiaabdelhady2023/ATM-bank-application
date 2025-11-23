module com.example.atmbankfrontend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atmbankfrontend to javafx.fxml;
    exports com.example.atmbankfrontend;
}