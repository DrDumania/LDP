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
import javafx.scene.control.Label;
/**
 *
 * @author Bruno
 */
public class JogoController {
    
    @FXML
    private Button sairButton;
    
    @FXML
    private Button regrasButton;
    
    @FXML
    private Label nameLabel;
    
    private Picaria mainApp;
    
    public void setMainApp(Picaria mainApp) {
        this.mainApp = mainApp;
    }
    
    @FXML
    private void handleRegrasButton() {
        try {
            mainApp.showRegrasScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    
    @FXML
    private void handleSairButton() {
        try {
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    
    @FXML
    public void setPlayerName(String playerName) {
        // Update do nome do jogador
        nameLabel.setText(playerName);
    }
}
