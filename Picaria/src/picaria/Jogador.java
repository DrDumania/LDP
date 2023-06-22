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
public class Jogador {
    
    private String nome;
    private Peca corJogador;

    public Jogador(String nome, Peca corJogador) {
        this.nome = nome;
        this.corJogador = corJogador;
    }

    public String getNome() {
        return nome;
    }

    public Peca getCorJogador() {
        return corJogador;
    }

    public void joga(int linha, int coluna, Tabuleiro tabuleiro) {
        Casa casa = tabuleiro.getCasa(linha, coluna);
        if (casa != null && casa.getOcupante() == null) {
            casa.setOcupante(this);
        }
    }
}
