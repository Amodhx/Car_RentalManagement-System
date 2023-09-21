package com.example.innovestaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TrackerController {

    @FXML
    private Button backButton;

    @FXML
    private AnchorPane pane;

    @FXML
    void onBackButtonCLick(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Sensors.fxml"));
        pane.getChildren().clear();
        pane.getChildren().add(root);
    }

}
