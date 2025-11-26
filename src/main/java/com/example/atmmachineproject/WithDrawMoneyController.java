package com.example.atmmachineproject;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
}
