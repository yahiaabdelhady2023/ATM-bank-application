package com.example.atmmachineproject;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Optional;
import java.util.Optional;

public class WithDrawMoneyController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public Text money_text;

    public void OnPressMoneyAmount(ActionEvent event){
        Button button_pressed = (Button)event.getSource();
        String money_amount = button_pressed.getText();
        System.out.println("Money to withdraw :" + money_amount);
        money_text.setText("Money to withdraw :"+ money_amount);

    }

    public void OnPressConfirm(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Withdraw Money Prompt");
        alert.setContentText("Are you sure you want to withdraw "+money_text.getText()+" ?");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK){
            System.out.println("YES!");
        }
        else{
            System.out.println("NO!");
        }
    }
}
