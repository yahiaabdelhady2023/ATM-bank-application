package com.example.atmmachineproject;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
}
