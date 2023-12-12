package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

import java.util.PrimitiveIterator;
import java.util.concurrent.Flow;

public class HelloController extends HelloApplication {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private TextArea textArea;
    @FXML
    private VBox vbox1;
    @FXML
    private VBox vbox2;
    @FXML
    public void onClickSendButton() {
        String mess = textArea.getText();
        System.out.println(mess);
        Button bubbleMess = new Button(mess);
        bubbleMess.getStyleClass().add("btn");
        bubbleMess.setWrapText(true);
        Button answerMess2 = new Button("Tôi có thể giúp gì?");
        answerMess2.getStyleClass().add("btn");
        answerMess2.setWrapText(true);
        Button transparentAnswer = new Button("skladfjlksjdlf");
        transparentAnswer.setVisible(false);
        transparentAnswer.getStyleClass().add("btn");
        transparentAnswer.setWrapText(true);
        Button transparentAnswer2 = new Button("ahhahhaha");
        transparentAnswer2.setVisible(false);
        transparentAnswer2.getStyleClass().add("btn");
        transparentAnswer2.setWrapText(true);
        vbox2.getChildren().add(bubbleMess);
        vbox2.getChildren().add(transparentAnswer2);
        vbox1.getChildren().add(transparentAnswer);
        vbox1.getChildren().add(answerMess2);
        textArea.clear();
    }
}