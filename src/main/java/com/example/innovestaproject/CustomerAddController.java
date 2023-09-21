package com.example.innovestaproject;

import dto.CustomerDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.CustomerModel;

import java.io.IOException;
import java.util.ArrayList;

public class CustomerAddController {

    @FXML
    private TextField address;
    @FXML
    private Button backButton;

    @FXML
    private TextField dob;

    @FXML
    private TextField firstName;

    @FXML
    private TextField getDate;

    @FXML
    private TextField lastName;

    @FXML
    private TextField lic;

    @FXML
    private TextField mail;

    @FXML
    private TextField nic;

    @FXML
    private Button saveButton;

    @FXML
    private CheckBox v1;

    @FXML
    private CheckBox v2;

    @FXML
    private CheckBox v3;

    @FXML
    private CheckBox v4;

    @FXML
    private CheckBox v5;

    @FXML
    private CheckBox v6;

    @FXML
    private CheckBox v7;

    @FXML
    private TextField workingAt;
    @FXML
    private AnchorPane pane;

    @FXML
    void onBackButtonClick(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("CustomerForm.fxml"));
        this.pane.getChildren().clear();
        this.pane.getChildren().add(root);

    }

    @FXML
    void onSaveButtonClick(ActionEvent event) throws IOException {
        String fName=firstName.getText();
        String lName=lastName.getText();
        String adres=address.getText();
        String bday=dob.getText();
        String id=nic.getText();
        String did=lic.getText();
        String wrk=workingAt.getText();
        String email=mail.getText();
        String date=getDate.getText();
        String url="null";

        if(v1.isSelected()){
            url="sen.png";

        }else if(v2.isSelected()){
            url="v3.png";

        }else if(v3.isSelected()){
            url="v4.png";

        }else if (v4.isSelected()){
            url="v5.png";

        } else if (v5.isSelected()) {
            url="v6.png";

        }else if (v6.isSelected()){
            url="v7.png";

        }else if(v7.isSelected()){
            url="v8.png";

        }
        CustomerDTO arr=new CustomerDTO(fName,lName,adres,bday,id,did,wrk,email,date,url);
        boolean ar= CustomerModel.SavCustomer(arr);

        Parent root=FXMLLoader.load(getClass().getResource("CustomerForm.fxml"));
        this.pane.getChildren().clear();
        this.pane.getChildren().add(root);




    }

}
