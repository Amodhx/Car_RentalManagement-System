package com.example.innovestaproject;

import dto.EmployeeDTO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.EmployeeModel;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class empController implements Initializable {

    @FXML
    private ImageView image;

    @FXML
    private TextField name;

    @FXML
    private TextField address;

    @FXML
    private TextField NIC;


    @FXML
    private TextField date;
    @FXML
    private TextField mail;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<EmployeeDTO> ar= EmployeeModel.getAllEmployee();

        if(ar.size()==0){ }else {

            Image im = new Image(getClass().getResourceAsStream(ar.get(0).getUrl()));
            image.setImage(im);
            name.setText(ar.get(0).getFname());
            NIC.setText(ar.get(0).getNationIC());
            mail.setText(ar.get(0).getEm());
            date.setText(ar.get(0).getBday());
        }
    }
}
