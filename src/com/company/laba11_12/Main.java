package com.company.laba11_12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

import java.io.IOException;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Калькулятор");
        stage.setScene(new Scene(root));
        stage.show();
    }
}