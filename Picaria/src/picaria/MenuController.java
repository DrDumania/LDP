/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picaria;

/**
 *
 * @author Bruno
 */
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

    private Picaria mainApp;

    @FXML
    private Button jogarButton;

    @FXML
    private Button regrasButton;

    public void setMainApp(Picaria mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
private void handleJogarButton() {
    try {
        mainApp.showNomeScreen();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@FXML
private void handleRegrasButton() {
    try {
        mainApp.showRegrasScreen();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
