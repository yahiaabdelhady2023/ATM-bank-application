package com.example.atmbankfrontend;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.annotation.ElementType;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox navbar = CreateNavBar();

        Scene scene = CreateInsertCardPage(navbar);
        scene.getStylesheets().add("design.css"); //ensure that design.css is under src/resources
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private HBox CreateNavBar(){
        HBox hbox = new HBox();

        Text bank_name_text = new Text("ATM Name");
        Text day_text = new Text("Sun 27");
        Text time_text = new Text("20:34 PM");
        Text temp_text = new Text("+7°");
        Button back_button = new Button("Back");

        bank_name_text.getStyleClass().add("navbar-title");
        day_text.getStyleClass().add("navbar-element");
        time_text.getStyleClass().add("navbar-element");
        back_button.getStyleClass().add("navbar-element");
        temp_text.getStyleClass().add("navbar-element");


        ObservableList<String> languages=FXCollections.observableArrayList(
                "English","Arabic","French"
        );


        ComboBox<String> combo_box = new ComboBox<>(languages);
        combo_box.setValue("English");
        combo_box.setId("combo_box");

        combo_box.getStyleClass().add("navbar-element");

        Region region_1 = new Region();
        Region region_2 = new Region();

        hbox.getChildren().addAll(bank_name_text,region_1,combo_box,time_text,day_text,temp_text,region_2,back_button);
        HBox.setHgrow(region_1, Priority.ALWAYS);
        HBox.setHgrow(region_2, Priority.ALWAYS);

        hbox.setAlignment(Pos.TOP_CENTER);
        hbox.setSpacing(10);
        return  hbox;
    }

    private Scene CreateInsertCardPage(HBox navbar){
        System.out.println("hello");
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
        stackpane.getChildren().add(navbar);
        stackpane.getChildren().add(insert_card_button);

        return new Scene(stackpane);
    }
}
