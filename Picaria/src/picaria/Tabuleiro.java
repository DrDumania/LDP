/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picaria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tabuleiro {

    private int linha;
    private int coluna;
    private Casa[][] tabuleiro;

    private int rodada; // Número da rodada atual

    private List<String> posicoesValidasJogador1; // Posições válidas para o jogador 1 na primeira rodada
    private List<String> posicoesValidasJogador2; // Posições válidas para o jogador 2 na primeira rodada

    private List<String> posicoesValidasGerais; // Posições válidas para todos os jogadores a partir da segunda rodada

    public Tabuleiro() {
        this.linha = 5;
        this.coluna = 5;
        this.tabuleiro = new Casa[linha][coluna];
        inicializarTabuleiro();
        inicializarPosicoesValidas();
        rodada = 1; // Inicializa a rodada como 1
    }
    
     public int getRodada() {
        return rodada;
    }

    public List<String> getPosicoesValidasJogador1() {
        return posicoesValidasJogador1;
    }

    public List<String> getPosicoesValidasJogador2() {
        return posicoesValidasJogador2;
    }

    public List<String> getPosicoesValidasGerais() {
        return posicoesValidasGerais;
    }

    private void inicializarTabuleiro() {
        // Inicializa o tabuleiro com as casas vazias e as casas onde não se podem jogar peças
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                tabuleiro[i][j] = new Casa();
            }
        }
        // Define as casas onde não se podem jogar peças
        tabuleiro[0][1] = null;
        tabuleiro[0][3] = null;
        tabuleiro[1][0] = null;
        tabuleiro[1][2] = null;
        tabuleiro[1][4] = null;
        tabuleiro[2][1] = null;
        tabuleiro[2][3] = null;
        tabuleiro[3][0] = null;
        tabuleiro[3][2] = null;
        tabuleiro[3][4] = null;
        tabuleiro[4][1] = null;
        tabuleiro[4][3] = null;
    }

    private void inicializarPosicoesValidas() {
        posicoesValidasJogador1 = Arrays.asList("a11", "a13", "a15", "a22", "a24", "a31", "a35", "a42", "a44", "a51", "a53", "a55");
        posicoesValidasJogador2 = new ArrayList<>(posicoesValidasJogador1);

        posicoesValidasGerais = new ArrayList<>(posicoesValidasJogador1);
        posicoesValidasGerais.add("a33"); // Permite jogar na posição a33 a partir da segunda rodada
    }

    public Casa getCasa(int linha, int coluna) {
        return tabuleiro[linha][coluna];
    }
}

