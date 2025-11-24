package com.example.atmbankfrontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = CreateMainPage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



    private Scene CreateMainPage(){
        StackPane stackpane = new StackPane();
        GridPane gridpane = new GridPane();
        stackpane.getChildren().add(gridpane);

        Text welcome_text = new Text("Welcome");
        Text customer_name_text = new Text("Steph");
        Text account_text = new Text("Account #1");
        Text account_money_text = new Text("$2000");
        Text savings_text = new Text("Savings #2");
        Text savings_money_text = new Text("$700");


        Button get_cash_button = new Button("Get Cash");
        Button deposit_button = new Button("Deposit");
        Button payments_button = new Button("Payments");
        Button credit_card_button = new Button("Credit Card");
        Button account_settings_button = new Button("Account Settings");
        Button others_button = new Button("Others");



        Button quick_cash_button = new Button("70$");



        gridpane.add(welcome_text,0,0);
        gridpane.add(customer_name_text,0,1);
        gridpane.add(account_text,0,2);
        gridpane.add(account_money_text,0,3);
        gridpane.add(savings_text,0,4);
        gridpane.add(savings_money_text,0,5);
        gridpane.add(get_cash_button,1,0);
        gridpane.add(payments_button,1,1);
        gridpane.add(account_settings_button,1,2);
        gridpane.add(deposit_button,2,0);
        gridpane.add(credit_card_button,2,1);
        gridpane.add(others_button,2,2);
        gridpane.add(quick_cash_button,1,3,2,1);
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        return new Scene(stackpane);

    }

    private Scene CreateInsertCardPage(){
        StackPane stackpane = new StackPane();
        Button insert_card_button = new Button("Insert your card!");
        stackpane.getChildren().add(insert_card_button);

        return new Scene(stackpane);
    }
}
