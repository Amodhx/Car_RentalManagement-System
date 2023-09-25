package com.example.innovestaproject;

import dto.CustomerDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import model.CustomerModel;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {
    @FXML
    private TextArea ancpane;

    @FXML
    private Button addButton;
    @FXML
    private AnchorPane pane;


@FXML
private AnchorPane amodhpane;


    @FXML
    private TextField addressTag;

    @FXML
    private TextField datetag;



    @FXML
    private TextField nametag;

    @FXML
    private TextField nictag;

    @FXML
    void OnAddButtonClick(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("CustomerAddForm.fxml"));
        this.pane.getChildren().clear();
        this.pane.getChildren().add(root);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<CustomerDTO> ar=CustomerModel.getAllCustomer();

        if(ar.size()==0){}else {
            Parent root= null;
            try {
                root = FXMLLoader.load(getClass().getResource("cusformController.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            this.amodhpane.getChildren().clear();
            this.amodhpane.getChildren().add(root);

        }

    }
}
