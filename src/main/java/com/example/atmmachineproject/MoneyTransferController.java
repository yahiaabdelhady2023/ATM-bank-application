package com.example.atmmachineproject;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MoneyTransferController {
    public TextField AccountNumberField;
    public TextField TransferMoneyField;
    public String account_number_string;
    public String transfer_money_string;

    public void ConfirmTransfer(ActionEvent event){
        account_number_string = AccountNumberField.getText();
        transfer_money_string = TransferMoneyField.getText();

        if (DepositController.isInteger(account_number_string) && !(DepositController.isNegative(account_number_string))){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Deposit Message");
            alert.setContentText("Account number is valid!");
            alert.show();
        }
    }
}
