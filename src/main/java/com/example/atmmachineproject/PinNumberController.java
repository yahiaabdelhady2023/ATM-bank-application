package com.example.atmmachineproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class PinNumberController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public PasswordField PinField;


    public void SwitchToMainPage(){

    }

    public void OnPressDigit(ActionEvent event){
        Button button =  (Button) event.getTarget();
        String button_text =button.getText();
        PinField.appendText(button_text);

    }

    public void OnPressClear(ActionEvent event){
        PinField.clear();
    }

    public void OnPressEnter(ActionEvent event) throws IOException{
        System.out.println(PinField.getText());
        Parent root = FXMLLoader.load(getClass().getResource("main-page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void OnPressCancel(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("insert-card.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
