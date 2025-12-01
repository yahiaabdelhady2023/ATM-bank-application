package com.example.atmmachineproject;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class GeneralUtilities {

    public static boolean isNegative(String amount){
        if(isInteger(amount)){
            if (Integer.parseInt(amount) > 0){
                return  false;
            }

        }
        else{
            return false;
        }
        return true;
    }

    public static  boolean isInteger(String amount){
        try {
            Integer.parseInt(amount);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }



    public static boolean CheckIfValidDigit(String amount, TextField IntegerField, String Message){
        if (isInteger(amount) && !(isNegative(amount)) ) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Important Message");
            alert.setContentText(Message + Integer.parseInt(amount));
            alert.show();
            IntegerField.clear();
            return true;
        }
        return false;

    }

    public static boolean CheckIfEmpty(String amount, TextField IntegerField, String Message){
        if (amount.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Important Message");
            alert.setContentText(Message);
            alert.show();
            IntegerField.clear();
            return true;
        }
        return false;

    }

    public static boolean CheckIfNegativeDigit(String amount, TextField IntegerField, String Message){
        if (isNegative(amount)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Important Message");
            alert.setContentText(Message);
            alert.show();
            IntegerField.clear();
            return true;
        }
        return false;

    }

    public static boolean CheckIfNonNumeric(String amount, TextField IntegerField, String Message){
        if (!(isInteger(amount)) && !(amount.isEmpty())) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Important Message");
            alert.setContentText(Message);
            alert.show();
            IntegerField.clear();
            return true;

        }
        return false;

    }
}
