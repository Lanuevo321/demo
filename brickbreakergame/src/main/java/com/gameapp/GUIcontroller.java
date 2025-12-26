package com.gameapp;

import java.io.IOException;

import javafx.fxml.FXML;

public class GUIcontroller {

    @FXML
    private void switchToGUIcontroller() throws IOException{
        App.setRoot("GUI");
    }

}
