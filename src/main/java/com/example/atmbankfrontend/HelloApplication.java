package com.example.atmbankfrontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = CreateInsertCardPage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private Scene CreateInsertCardPage(){
        System.out.println("hello");
        StackPane stackpane = new StackPane();

        Button insert_card_button = new Button("Insert your card!");
        stackpane.getChildren().add(insert_card_button);

        return new Scene(stackpane);
    }
}
