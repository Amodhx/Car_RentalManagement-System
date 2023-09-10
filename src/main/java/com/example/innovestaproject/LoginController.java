package com.example.innovestaproject;


import Control.UserFormController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class LoginController {
    @FXML
    private Button button;
    @FXML
    private TextField textField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    public void OnLabelClick() throws Exception{
        Parent root;
        root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PassWordChange.fxml")));
        Stage stage=new Stage();
        stage.setScene(new Scene(root,269,416));
        stage.show();
        Stage stage1=(Stage) button.getScene().getWindow();
        stage1.close();

    }

    public void OnButtonClick() throws Exception{
        String x=textField.getText();
        String y=passwordField.getText();

        boolean flag= UserFormController.setUserTable(x,y);


        if(flag){
            Parent root;
            root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DashBoard.fxml")));
            Stage stage=new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root,100,825));
            stage.setResizable(false);
            stage.show();
            Stage stage1=(Stage) button.getScene().getWindow();
            stage1.close();

        }else{
            l2.setText("Password or username incorrect>");
        }

    }
}



