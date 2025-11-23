package com.example.atmbankfrontend;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        ObservableList<String> languages=FXCollections.observableArrayList(
                "English","Arabic","French"
        );


        ComboBox<String> combo_box = new ComboBox<>(languages);
        combo_box.setValue("English");
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

        Button insert_card_button = new Button("Insert your card!");
        stackpane.getChildren().add(navbar);
        stackpane.getChildren().add(insert_card_button);

        return new Scene(stackpane);
    }
}
