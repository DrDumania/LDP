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
import java.util.Stack;


public class Picaria extends Application {
    

    private Stage menuStage;
   
    private Stack<Scene> sceneHistory = new Stack<>();

    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;
    private Tabuleiro tabuleiro;
    
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
    
    
    public void showJogoScreen(String playerName) throws Exception {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Picaria.class.getResource("Jogo.fxml"));
        Parent root = loader.load();

        // Optionally, you can pass any necessary data to the controller
        JogoController controller = loader.getController();
        controller.setMainApp(this);
        controller.setPlayerName(playerName);

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
    
     public void mudaJogador() {
        jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
    }

    public Jogador getVencedor() {
        // Lógica para determinar o vencedor do jogo
        // Retorna o jogador vencedor ou null se não houver vencedor
        return null;
    }

    public void jogar(int linha, int coluna) {
        String posicao = "a" + (linha + 1) + (coluna + 1); // Converte os índices para a notação da posição (exemplo: a11, a22, etc.)

        if (tabuleiro.getRodada() == 1) {
            if (jogadorAtual == jogador1 && tabuleiro.getPosicoesValidasJogador1().contains(posicao) ||
                    jogadorAtual == jogador2 && tabuleiro.getPosicoesValidasJogador2().contains(posicao)) {
                jogadorAtual.joga(linha, coluna, tabuleiro);
                mudaJogador();
            }
        } else {
            if (tabuleiro.getPosicoesValidasGerais().contains(posicao)) {
                jogadorAtual.joga(linha, coluna, tabuleiro);
                mudaJogador();
            }
        }
    }

    public void acabaJogo() {
        // Lógica para encerrar o jogo
    }

    
   
    public static void main(String[] args) {
        launch(args);
    }
}
