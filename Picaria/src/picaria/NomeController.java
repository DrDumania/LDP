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
import javafx.scene.control.TextField;
/**
 *
 * @author Bruno
 */
public class NomeController {
    
    private Picaria mainApp;

    @FXML
    private Button voltarButton;
    
    @FXML
    private Button confirmarButton;
    
    @FXML
    private TextField nomeTextField;

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
    
    @FXML
    private void handleConfirmarButton() {
        try {
            String playerName = nomeTextField.getText();
            mainApp.showJogoScreen(playerName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
