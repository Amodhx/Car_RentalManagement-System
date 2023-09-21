package com.example.innovestaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainFromController implements Initializable {


    @FXML
    private Button BookingButton;

    @FXML
    private Button CustomerButton;

    @FXML
    private Button DashBoardButton;

    @FXML
    private Button EmployeeButton;

    @FXML
    private Button PaymentButton;

    @FXML
    private Button VehicalButton;

    @FXML
    private AnchorPane apane;
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private AnchorPane notifilay;

    private Stage stage2;
    @FXML
    void onbtn1Click(ActionEvent event) throws IOException {

        if (notifilay.isVisible()){
            notifilay.setVisible(false);
        }else{
            notifilay.setVisible(true);
        }

    }

    @FXML
    void onbtn2CLick(ActionEvent event) {


    }



    @FXML
    void OnBookingButtonClick(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(this.getClass().getResource("bookingForm.fxml"));
        this.apane.getChildren().clear();
        this.apane.getChildren().add(root);
    }

    @FXML
    void onCustomerButtonClick(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("CustomerForm.fxml"));
        this.apane.getChildren().clear();
        this.apane.getChildren().add(root);


    }

    @FXML
    void onDashBoardClick(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("DashBoard.fxml")));
        this.apane.getChildren().clear();
        this.apane.getChildren().add(root);

    }

    @FXML
    void onEmployeeButtonclick(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("EmployeeForm.fxml"));

        this.apane.getChildren().clear();
        this.apane.getChildren().add(root);

    }

    @FXML
    void onPayementButtonClick(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("PaymentForm.fxml")));
        this.apane.getChildren().clear();
        this.apane.getChildren().add(root);

    }

    @FXML
    void onVehicalButtonClick(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("vehicalForm.fxml")));
        this.apane.getChildren().clear();
        this.apane.getChildren().add(root);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            Parent  root = FXMLLoader.load(this.getClass().getResource("notification.fxml"));
            this.notifilay.getChildren().clear();
            this.notifilay.getChildren().add(root);
            notifilay.setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
