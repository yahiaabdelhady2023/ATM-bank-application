package com.example.atmbankfrontend;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.annotation.ElementType;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HBox navbar = CreateNavBar();

        Scene scene = CreateInsertCardPage(navbar);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private HBox CreateNavBar(){
        HBox hbox = new HBox();

        Text bank_name_text = new Text("ATM Name");
        Text time_text = new Text("Sun 27");

        String languages[] = {"English","Arabic","French"};
//        ComboBox combo_box = new ComboBox(FXCollections.observableArrayList(languages));

        hbox.getChildren().addAll(bank_name_text,time_text);
        hbox.setAlignment(Pos.TOP_CENTER);
        hbox.setSpacing(10);
        return  hbox;
    }

    private Scene CreateInsertCardPage(HBox navbar){
        System.out.println("hello");
        StackPane stackpane = new StackPane();

        Button insert_card_button = new Button("Insert your card!");
        stackpane.getChildren().add(navbar);
        stackpane.getChildren().add(insert_card_button);

        return new Scene(stackpane);
    }
}
