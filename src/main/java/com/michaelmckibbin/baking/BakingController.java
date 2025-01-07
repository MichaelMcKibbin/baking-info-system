package com.michaelmckibbin.baking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BakingController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label lookText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onLookButtonClick(ActionEvent actionEvent) { lookText.setText("Look at me!");
    }


}