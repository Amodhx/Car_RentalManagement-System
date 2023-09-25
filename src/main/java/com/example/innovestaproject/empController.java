package com.example.innovestaproject;

import dto.EmployeeDTO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.EmployeeModel;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class empController implements Initializable {


    @FXML
    private TextField address;

    @FXML
    private Label dob;

    @FXML
    private Label id;



    @FXML
    private Label jobrole;

    @FXML
    private Label mail;

    @FXML
    private Label name;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<EmployeeDTO> ar= EmployeeModel.getAllEmployee();

        if(ar.size()==0){ }else {
            name.setText(ar.get(0).getFname()
            );

        }
    }
}
