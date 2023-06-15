/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Picaria extends Application {
    

    private Stage menuStage;
    
    Jogador jogador1;
    Jogador jogador2;
    Jogador jogadorAtual;
    
    public void showMenuScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Picaria.class.getResource("menu.fxml"));
        Parent root = loader.load();

        MenuController controller = loader.getController();
        controller.setMainApp(this);

        // Set the scene and show the stage
        Scene scene = new Scene(root);
        menuStage.setScene(scene);
        menuStage.show();
    }
    
    public void showNomeScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Picaria.class.getResource("nome.fxml"));
        Parent root = loader.load();

        // Optionally, you can pass any necessary data to the controller
        NomeController controller = loader.getController();
        controller.setMainApp(this);

        // Set the scene and show the stage
        Scene scene = new Scene(root);
        menuStage.setScene(scene);
        menuStage.show();
    }

    public void showRegrasScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Picaria.class.getResource("Regras.fxml"));
        Parent root = loader.load();

        // Optionally, you can pass any necessary data to the controller
        RegrasController controller = loader.getController();
        controller.setMainApp(this);

        // Set the scene and show the stage
        Scene scene = new Scene(root);
        menuStage.setScene(scene);
        menuStage.show();
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {  
        menuStage = primaryStage;
        showMenuScreen();
    }
    
    public void mudaJogador(){
        
    }

    
    public void getVencedor(){
        
    }
    
    
    public void jogar(int linha, int coluna){
        
    }
    
    
    public void acabaJogo(){
        
    }
    
    

    public static void main(String[] args) {
        launch(args);
    }
}
