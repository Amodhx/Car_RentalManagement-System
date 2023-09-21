package com.example.innovestaproject;

import dto.EmployeeDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import lombok.SneakyThrows;
import model.EmployeeModel;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class EmployeeCOntroller implements Initializable {

    public TextField txtText;
    @FXML
    private Button btn;
    @FXML
    private AnchorPane pane;
    @FXML
    private ImageView image;
    @FXML
    private TextField name;

  @FXML
  private AnchorPane a1;

  @FXML
  private AnchorPane a2;


    @FXML
    void ontbnclick(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("EmployeeAddForm.fxml"));
        this.pane.getChildren().clear();
        this.pane.getChildren().add(root);

    }


    @SneakyThrows
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<EmployeeDTO> ar= EmployeeModel.getAllEmployee();

        if(ar.size()==0){


        }else {

            Parent root = FXMLLoader.load(getClass().getResource("emp.fxml"));
            this.a1.getChildren().clear();
            this.a1.getChildren().add(root);
        }



    }
}
