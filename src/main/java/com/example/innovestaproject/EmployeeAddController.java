package com.example.innovestaproject;

import dto.EmployeeDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.EmployeeModel;

import java.io.IOException;

public class EmployeeAddController {
    @FXML
    private TextField dob;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField licenseId36;

    @FXML
    private TextField mail;

    @FXML
    private TextField nic;


    @FXML
    private Button backButton;
    @FXML
    private AnchorPane pane;

    @FXML
    private Button addButton;
    @FXML
    private TextField address;
    @FXML
    void onbackButtonCLick(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("EmployeeForm.fxml"));
        this.pane.getChildren().clear();
        this.pane.getChildren().add(root);
    }

    @FXML
    void OnAddButtonClick(ActionEvent event) throws IOException {
        String fname=firstName.getText();
        String sname=lastName.getText();
        String ad=address.getText();
        String bday=dob.getText();
        String NationIC=nic.getText();
        String Did=licenseId36.getText();
        String em=mail.getText();
        String url="profile.png";

        EmployeeDTO employee=new EmployeeDTO(fname,sname,ad,bday,NationIC,Did,em,url);

        boolean isAdd= EmployeeModel.SavEmployee(employee);
        System.out.println(isAdd);

        Parent root= FXMLLoader.load(getClass().getResource("EmployeeForm.fxml"));
        this.pane.getChildren().clear();
        this.pane.getChildren().add(root);


    }

}
