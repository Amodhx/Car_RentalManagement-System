package com.example.innovestaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.text.ParseException;

public class SensorsController {

    @FXML
    private Button AlarmButton;

    @FXML
    private Button btnspeed;

    @FXML
    private Button btntracker;
    @FXML
    private Button backButton;

    @FXML
    private AnchorPane pane;
    @FXML
    void onBackButtonCLick(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("vehicalForm.fxml"));
        pane.getChildren().clear();
        pane.getChildren().add(root);

    }

    @FXML
    void OnTrackerButtonclick(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("TrackerForm.fxml"));
        pane.getChildren().clear();
        pane.getChildren().add(root);

    }

    @FXML
    void onAlarmButtonClick(ActionEvent event) {

    }

    @FXML
    void onSpeenButtonClick(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("SpeedForm.fxml"));
        pane.getChildren().clear();
        pane.getChildren().add(root);


    }

}
