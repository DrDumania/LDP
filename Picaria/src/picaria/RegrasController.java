/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picaria;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Bruno
 */
public class RegrasController {
    
    private Picaria mainApp;
    

    @FXML
    private Button voltarButton;

    public void setMainApp(Picaria mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleVoltarButton() {
        try {
            mainApp.showMenuScreen();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
