package com.example.atmmachineproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AreYouSureController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public static Object caller_function;

    public void OnPressYes(){

    }

    public void GoToMainPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main-page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
