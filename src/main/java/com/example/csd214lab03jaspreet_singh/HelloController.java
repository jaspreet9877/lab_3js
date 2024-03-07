package com.example.csd214lab03jaspreet_singh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public Button hbt;
    @FXML
    private Label welcomeText;


    public void onHelloButtonClick(ActionEvent actionEvent) {

        try {

            Parent secondScene = FXMLLoader.load(getClass().getResource("dashboard.fxml"));


            Stage secondStage = new Stage();
            secondStage.setTitle("Dashboard");
            secondStage.setScene(new Scene(secondScene));

            Stage firstSceneStage = (Stage) hbt.getScene().getWindow();
            firstSceneStage.close();




            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
