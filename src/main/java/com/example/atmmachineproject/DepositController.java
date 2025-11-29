package com.example.atmmachineproject;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DepositController {
    public TextField IntegerField;
    public String deposit_amount;

     public static boolean isNegative(String deposit_amount){
         if(isInteger(deposit_amount)){
             if (Integer.parseInt(deposit_amount) > 0){
                 return  false;
             }

         }
         else{
             return false;
         }
         return true;
     }

     public static  boolean isInteger(String deposit_amount){
         try {
            Integer.parseInt(deposit_amount);
            return true;
         }
         catch (NumberFormatException e){
             return false;
         }
    }

    public void ConfirmDeposit(ActionEvent event){
        deposit_amount = IntegerField.getText();

        if (isInteger(deposit_amount) && !(isNegative(deposit_amount)) ) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Deposit Message");
            alert.setContentText("You have Deposited " + deposit_amount + "$ Succesfully!");
            alert.show();
            IntegerField.clear();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Deposit Message");
            alert.setContentText("Error you must use digits only!");
            alert.show();
            IntegerField.clear();
        }


    }

}
