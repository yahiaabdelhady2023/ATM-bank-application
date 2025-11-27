package com.example.atmmachineproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class WithDrawMoneyController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public Text money_text;
    public Button confirm_button;

    public void OnPressMoneyAmount(ActionEvent event){
        Button button_pressed = (Button)event.getSource();
        String money_amount = button_pressed.getText();
        System.out.println("Money to withdraw :" + money_amount);
        money_text.setText("Money to withdraw :"+ money_amount);

    }

    public void OnPressConfirm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("are-you-sure-page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
