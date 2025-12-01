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

        GeneralUtilities.CheckIfEmpty(account_number_string,  AccountNumberField, "Account Number: You cannot just leave empty textfield");
        GeneralUtilities.CheckIfNonNumeric(account_number_string,  AccountNumberField, "Account Number: You cannot have non-numeric characters!");
        GeneralUtilities.CheckIfNegativeDigit(account_number_string,  AccountNumberField, "Account Number: You cannot have negative digits!");

        GeneralUtilities.CheckIfEmpty(transfer_money_string,  TransferMoneyField, "Transfer: You cannot just leave empty textfield");
        GeneralUtilities.CheckIfNonNumeric(transfer_money_string,  TransferMoneyField, "Transfer: You cannot have non-numeric characters!");
        GeneralUtilities.CheckIfNegativeDigit(transfer_money_string,  TransferMoneyField, "Transfer: You cannot have negative digits!");


    }
}
