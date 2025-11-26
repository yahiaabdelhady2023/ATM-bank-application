module com.example.atmmachineproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires javafx.graphics;

    opens com.example.atmmachineproject to javafx.fxml;
    exports com.example.atmmachineproject;
}