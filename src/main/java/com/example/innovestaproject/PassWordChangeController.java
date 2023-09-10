package com.example.innovestaproject;

import Control.UserFormController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.UserModel;


import java.util.Objects;

public class PassWordChangeController {

    @FXML
    private Button button;

    @FXML
    private Label l1;

    @FXML
    private TextField un;

    @FXML
    private TextField pw;
    @FXML
    private Button button2;

    public void onButton2Click(){
        System.exit(0);

    }
    public void OnButtonClick() throws Exception{
        String x=un.getText();
        String y=pw.getText();
        boolean flag= UserFormController.setUser(x);

        if(flag){
            boolean f= UserModel.changePass(x,y);
            Parent root;
            root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
            Stage stage=new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root,623,457));
            stage.show();
            Stage stage1=(Stage) button.getScene().getWindow();
            stage1.close();

        }else{
            l1.setText("Invalid UserName");

        }






    }
}

