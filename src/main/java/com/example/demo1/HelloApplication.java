package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent parent = root.load();
        Scene scene = new Scene(parent, 400, 600, false, SceneAntialiasing.BALANCED);
        scene.getStylesheets().add(HelloApplication.class.getResource("/com/css/application-dark.css").toExternalForm());
        scene.setRoot(parent);
        stage.setTitle("Messenger");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}