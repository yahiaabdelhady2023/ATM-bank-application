package com.example.atmmachineproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public Text money_text;
    boolean ishidden = true;

    public void OnPressHide(){
        if (ishidden){
            ishidden = false;
        }
        else{
            ishidden = true;
        }
        money_text.setVisible(ishidden);
    }

    public void OnPressWithDrawMoney(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("withdraw-money-page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
